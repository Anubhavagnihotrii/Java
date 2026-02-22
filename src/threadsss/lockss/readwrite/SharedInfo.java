package threadsss.lockss.readwrite;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedInfo {
    private int count=0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){
        lock.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+" reading value : "+count);
            Thread.sleep(100);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            lock.readLock().unlock();
        }
    }
    public void write(){
        lock.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+" writing value : "+count);
            count++;
            Thread.sleep(100);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            lock.writeLock().unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SharedInfo sharedInfo = new SharedInfo();
        Runnable r1 = ()->{
            for (int i = 0; i < 50; i++) {
                sharedInfo.write();
            }
        };
        Runnable r2 = ()->{
            for (int i = 0; i < 10; i++) {
                sharedInfo.read();
            }
        };
        Runnable r3 = ()->{
            for (int i = 0; i < 10; i++) {
                sharedInfo.read();
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }

}
