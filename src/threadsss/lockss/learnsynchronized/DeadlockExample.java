package threadsss.lockss.learnsynchronized;

class Account {
    private int balance;
    Account(int balance) { this.balance = balance; }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " Deposited: " + amount + ", Balance: " + balance);
    }

    public void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " Not enough balance");
        }
    }

    public int getBalance() { return balance; }
}

public class DeadlockExample {
    public static void transfer(Account from, Account to, int amount){
        synchronized(from) {
            System.out.println(Thread.currentThread().getName() + " locked " + from);
            // simulate some delay
            try { Thread.sleep(100); } catch(InterruptedException e) {}
            synchronized(to) {
                System.out.println(Thread.currentThread().getName() + " locked " + to);
                from.withdraw(amount);
                to.deposit(amount);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Account ac1 = new Account(100);
        Account ac2 = new Account(200);

        Thread t1 = new Thread(() -> transfer(ac1, ac2, 50), "Thread-1");
        Thread t2 = new Thread(() -> transfer(ac2, ac1, 70), "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final ac1: " + ac1.getBalance());
        System.out.println("Final ac2: " + ac2.getBalance());
    }
}

// Thread-1 locks ac1 first, then tries to lock ac2
// Thread-2 locks ac2 first, then tries to lock ac1
// Both threads end up waiting for each other → classic deadlock

// We could make the entire transfer method synchronized,
// but then only one thread could execute it at a time,
// which would eliminate deadlocks but also **lose concurrency**.

// The better solution is to use ReentrantLock with tryLock,
// which allows threads to attempt locking and back off if the lock is unavailable,
// thus preventing indefinite waiting while still allowing concurrency.