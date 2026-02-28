package threadsss.ExecutorFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Listcallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> cal1= ()->{
            Thread.sleep(1000);
            System.out.println("Task1");
            return 10;
        };
        Callable<Integer> cal2= ()->{
            Thread.sleep(1000);
            System.out.println("Task2");
            return 20;
        };
        Callable<Integer> cal3= ()->{
            Thread.sleep(1000);
            System.out.println("Task3");
            return 30;
        };

        List<Callable<Integer>> list = new ArrayList<>();
        list.add(cal1);
        list.add(cal2);
        list.add(cal3);

        ExecutorService executorService= Executors.newFixedThreadPool(2);

        List<Future<Integer>> futures = executorService.invokeAll(list, 3, TimeUnit.SECONDS);

        for (Future<Integer>f : futures) {
            System.out.println(f.get());
        }
        executorService.shutdown();
        System.out.println("hello world");

    }
}
