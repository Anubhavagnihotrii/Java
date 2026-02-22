package threadsss.prodCon;
class Producer implements Runnable{
    private SharedBuffer buffer;
    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer implements Runnable{
    private SharedBuffer buffer;
    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                buffer.consume();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class SharedBuffer {
    int data;
    private boolean hasData = false;
    synchronized void produce(int val) throws InterruptedException {
        while(hasData){
            wait();
        }
        data=val;
        hasData=true;
        System.out.println("Produced " + val);
        notify();
    }
    synchronized void consume() throws InterruptedException {
        while(!hasData){
            wait();
        }
        hasData=false;
        System.out.println("Consumed " + data);
        notify();
    }
}
public class Main{
    public static void main(String[] args) {
        SharedBuffer sb = new SharedBuffer();
        Thread producer = new Thread(new Producer(sb));
        Thread consumer = new Thread(new Consumer(sb));
        producer.start();
        consumer.start();
    }
}