package threadsss.creation.implementRunabble;

/*
 * Class A implements Runnable.
 * It does NOT become a thread by itself.
 * It only defines the task that a thread will execute.
 */
class A implements Runnable {

    @Override
    public void run() {
        System.out.println("In A - Time: " + System.currentTimeMillis());
    }
}

/*
 * Class B also implements Runnable.
 */
class B implements Runnable {

    @Override
    public void run() {
        System.out.println("In B - Time: " + System.currentTimeMillis());
    }
}

public class Example {

    public static void main(String[] args) throws InterruptedException {

        A objA = new A();
        B objB = new B();

        Thread thread1 = new Thread(objA);
        Thread thread2 = new Thread(objB);

        thread1.start();   // This creates a new thread and calls run()
        thread2.start();

        /*
         * Main thread runs independently.
         * It may finish before thread1 and thread2.
         */
        System.out.println("This is the main thread - Time: " + System.currentTimeMillis());

        // If you want main thread to wait for both threads to finish
        thread1.join();
        thread2.join();

        System.out.println("All threads finished execution.");
    }
}