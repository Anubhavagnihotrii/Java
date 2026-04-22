package threadsss.ExecutorFramework;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        int players = 3;
        CyclicBarrier barrier = new CyclicBarrier(players,()-> System.out.println("aLl player finished."));
        Runnable player = ()->{
            for (int i = 0; i < players; i++) {
                try {
                    System.out.println(Thread.currentThread().getName()+" sprint "+i+ " finished the round");
                    barrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        for (int i = 0; i < players; i++) {
            new Thread(player).start();
        }

        System.out.println("main thread here is not blocked");
    }
}


//CyclicBarrier = threads wait for each other at a common point (can repeat)

//CountDownLatch = some threads wait for other threads to finish work (one time only)