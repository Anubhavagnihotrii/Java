package threadsss.lockss.learnsynchronized;

/*
 * Calc class contains a shared variable 'count'.
 * Two threads will try to update this variable.
 */
class Calc {

    int count = 0;  // Shared resource

    /*
     * synchronized keyword ensures:
     * Only ONE thread at a time can execute this method
     * on the same object (calc).
     *
     * It provides intrinsic locking (monitor lock).
     */
    public synchronized void updateCount() {
        count++;   // Not atomic without synchronization
    }
}

public class Example {

    public static void main(String[] args) throws InterruptedException {

        // Shared object
        Calc calc = new Calc();

        /*
         * Thread 1 task:
         * Increment count 100 times
         */
        Runnable r1 = () -> {
            for (int i = 0; i < 100; i++) {
                calc.updateCount();
            }
        };

        /*
         * Thread 2 task:
         * Increment count 100 times
         */
        Runnable r2 = () -> {
            for (int i = 0; i < 100; i++) {
                calc.updateCount();
            }
        };

        // Creating threads
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        // Starting threads
        t1.start();
        t2.start();

        /*
         * join() makes main thread wait
         * until both threads finish execution.
         */
        t1.join();
        t2.join();

        /*
         * Because updateCount() is synchronized,
         * final value will always be 200.
         */
        System.out.println("Final Count: " + calc.count);
    }
}