package threadsss.priority;

public class Example {
    public static void main(String[] args) {
        Runnable r1  = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                }
            }
        };
        Runnable r2 = ()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("World");
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName() +" " + Thread.currentThread().getPriority());

//        here we can see the priority of main thread is not affected but
//        t2 is max priority so printing world before hello
//        since priority of t1 is minimum.
//        for Threads min priority is 1 while maximum is 10.

//        Thread priorities are hints to JVM, but not guarantees
    }
}
