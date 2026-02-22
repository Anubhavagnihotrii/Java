package threadsss.lockss.reentrant;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyAccount{
    private int balance;
    private final ReentrantLock lock = new ReentrantLock();
    MyAccount(int balance){
        this.balance=balance;
    }
    public int getBalance() {
        return balance;
    }
    void deposit(int amount){
        this.balance+=amount;
    }
    boolean withdraw(int amount){
        if(this.balance>=amount) {
            this.balance -= amount;
            return true;
        }else{
            System.out.println("Insufficient balance");
        }
        return false;
    }

    public ReentrantLock getLock() {
        return lock;
    }
}
public class ReentrantExample2 {
    public static boolean transferMoney(MyAccount from, MyAccount to, int amount) throws InterruptedException {
        if(from.getLock().tryLock(500,TimeUnit.MILLISECONDS)){
            try{
                if(to.getLock().tryLock(500,TimeUnit.MILLISECONDS)){
                    try{
                        if (from.withdraw(amount)) {
                            to.deposit(amount);
                            System.out.println(Thread.currentThread().getName() +
                                    ": Transfer successful " + amount);
                            return true;
                        } else {
                            System.out.println(Thread.currentThread().getName() +
                                    ": Transfer failed due to insufficient balance");
                            return false;
                        }
                    }finally {
                        to.getLock().unlock();
                    }
                }else{
                    System.out.println("Could not acquire lock in TO");
                }
            }finally {
                from.getLock().unlock();
            }
        }else{
            System.out.println("Could not acquire lock in FROM");
        }
        return false;
    }
    public static void main(String[] args) throws InterruptedException {
        MyAccount ac1 = new MyAccount(100);
        MyAccount ac2 = new MyAccount(200);

        Thread t1 = new Thread(()-> {
            try {
                transferMoney(ac1,ac2,50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Thread-1");
        Thread t2 = new Thread(()-> {
            try {
                transferMoney(ac2,ac1,100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(ac1.getBalance());
        System.out.println(ac2.getBalance());

    }
}
