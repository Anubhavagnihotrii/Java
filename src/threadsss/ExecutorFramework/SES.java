package threadsss.ExecutorFramework;

import java.util.concurrent.*;

public class SES {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
//        scheduler.schedule(()-> System.out.println("hello world"), 10, TimeUnit.SECONDS);
//        System.out.println("main thread");

        ScheduledFuture<?> fixedTimeIntervalTask = scheduler.scheduleAtFixedRate(
                () -> {
                    System.out.println("Task will get executed after every 5 seconds");
                }, 2, 5, TimeUnit.SECONDS
        );

        scheduler.scheduleWithFixedDelay(()-> System.out.println("hello from anubhav"), 3, 5, TimeUnit.SECONDS);
        scheduler.awaitTermination(5, TimeUnit.SECONDS);
//        scheduler.shutdown();
        scheduler.schedule(()->scheduler.shutdown(),5, TimeUnit.SECONDS);
        // or we can also use CountDownLatch as well or Cyclic Barrier
    }
}
