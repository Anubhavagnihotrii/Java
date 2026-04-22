package threadsss.ExecutorFramework;

import java.util.concurrent.atomic.AtomicInteger;

class SharedDataClass {
    int counter =0;
    AtomicInteger atomicInteger = new AtomicInteger(0);

    public int getCounter() {
        return counter;
    }
    public void incrementCounter() {
        counter++;
    }

    public int getAtomicInteger() {
        return atomicInteger.get();
    }

    public void incrementAtomicInteger() {
        atomicInteger.incrementAndGet();
    }
}
public class AtomicExample {
    public static void main(String[] args) throws InterruptedException {
        SharedDataClass sdc = new SharedDataClass();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                sdc.incrementCounter();
                sdc.incrementAtomicInteger();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++){
                sdc.incrementCounter();
                sdc.incrementAtomicInteger();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sdc.getCounter());
        System.out.println(sdc.getAtomicInteger());
    }
}
