package threadsss.priority;

class MyCustomThread extends Thread{
    MyCustomThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
//            This hints the JVM that the current thread is willing
//            to pause its execution so other threads of the same priority can run.
//            It does not guarantee that another thread will run immediately.
        }
    }
}
public class YieldMethodExample {
    public static void main(String[] args) {
        MyCustomThread t1 = new MyCustomThread("t1");
        MyCustomThread t2 = new MyCustomThread("t2");
        t1.start();
        t2.start();
    }
}