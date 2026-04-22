package threadsss.ExecutorFramework;

import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(7);

       java.util.concurrent.Future<String> f1 = CompletableFuture.supplyAsync(()-> {
            for (int i = 0; i < 20; i++) {
                CompletableFuture.runAsync(() -> {
                    System.out.println(Thread.currentThread().getName());
                },executorService);
            }
            return "OK";
        });
//        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(()-> {
//            try {
//                Thread.sleep(2000);
//                System.out.println("Hello World 2");
//                return "OK 2";
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }bb
//        });

        f1.get();
//        f2.get();    // blocking makes main thread wait

//        try{
//            f1.get(2, TimeUnit.SECONDS);
//        }catch (Exception e){
//            System.out.println("taking so much of the time");
//            System.out.println(e.getCause().getLocalizedMessage());
//        }
//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(f1, f2);
//        voidCompletableFuture.join();   // this works same as join method of thread makes main thread to wait until future completes.

        System.out.println("Main");
        executorService.shutdown();
    }
}

//By default, CompletableFuture tasks often run on daemon threads due to use of ForkJoinPool.commonPool
// We can take control thread type by providing custom executor service.
// Completable future task itself doesn't  dictate whether it is a daemon or user Thread.
