package threadsss.creation.extendingThread;

/*
 * Class A extends Thread
 * This means A becomes a separate thread when we call start()
 */
class A extends Thread {

    // This method contains the task that will run in the new thread
    @Override
    public void run() {
        System.out.println("In A - Time: " + System.currentTimeMillis());
    }
}

/*
 * Class B also extends Thread
 */
class B extends Thread {

    @Override
    public void run() {
        System.out.println("In B - Time: " + System.currentTimeMillis());
    }
}

public class Example {

    public static void main(String[] args) throws InterruptedException {

        // Creating objects of A and B (threads are NOT started yet)
        A a = new A();
        B b = new B();

        // Starting both threads
        // start() internally calls the run() method in a separate thread
        a.start();
        b.start();

        /*
         * The main thread runs independently.
         * It does NOT wait for A and B to finish unless we use join().
         * So this line may print before or after A and B.
         */
        System.out.println("This is my main thread - Time: " + System.currentTimeMillis());

        /*
         * If we want the main thread to wait until A and B finish,
         * we use join()
         */
        a.join();   // main thread waits for thread A to finish
        b.join();   // main thread waits for thread B to finish

        System.out.println("All threads finished execution.");
    }
}