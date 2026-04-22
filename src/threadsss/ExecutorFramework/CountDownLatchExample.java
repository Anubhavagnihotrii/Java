package threadsss.ExecutorFramework;

import java.util.concurrent.*;

public class CountDownLatchExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int noOfServices=3;
        ExecutorService executorService =Executors.newFixedThreadPool(noOfServices);

        CountDownLatch latch = new CountDownLatch(3);
        for (int i = 0; i < noOfServices ; i++) {
                int id =i;
                executorService.execute(()->{
                    try {
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName()+"Task" +id+ "completed." + System.currentTimeMillis());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }finally {
                        latch.countDown();
                    }
                });
        }
        latch.await();
        System.out.println("Main thread started.");
        executorService.shutdown();
    }
}

// so here we just want our main thread to wait until the tasks are done, which we achieved using latch.await()
// which makes sure all the tasks gets completed then only main thread will be given access to proceed further.
// but only drawback here we have is , we can't use countdown latch again, so there comes a cyclic barrier.


// CountDownLatch is a one-time-use synchronization aid.
// Once the count reaches 0, it cannot be reset or reused.

// It is mainly used when one or more threads need to wait
// until a set of operations being performed by other threads completes.

// If you need a reusable synchronization mechanism where threads
// repeatedly wait for each other at a common barrier point,
// then CyclicBarrier should be used.

// CyclicBarrier can be reset and reused after all threads reach the barrier.