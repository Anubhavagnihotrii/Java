package threadsss.ExecutorFramework;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<?> callable = new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return 42;
            }
        };
//        Future<?> future = executorService.submit(()-> 42);
        Future<?> future = executorService.submit(callable);
        Future<?> futureRunnable = executorService.submit(()-> System.out.println("Hello World"));
        System.out.println(future.get());

//        futureRunnable.get();   // makes main thread wait
        if (futureRunnable.isDone()){
            System.out.println("success");
        }else{
            System.out.println("failed");
        }

        executorService.shutdown();

    }
}
