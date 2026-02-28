package threadsss.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    static int fact(int n) throws InterruptedException {
        if(n==0 || n==1)
            return 1;
        else{
            Thread.sleep(100);
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                try {
                    System.out.println(fact(finalI)+ Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        executor.shutdown();
//        executor.shutdownNow();
        if(!executor.awaitTermination(2, TimeUnit.SECONDS))
            throw new RuntimeException("Taking more time");
        else
            System.out.println("total time = "+ (System.currentTimeMillis()-startTime));

    }
}
