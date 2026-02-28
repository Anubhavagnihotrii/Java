package threadsss.priority;
class MyDaemonThreadExample extends Thread{
    MyDaemonThreadExample(String name){
        super(name);
    }
    @Override
    public void run() {
        for(;;){
            System.out.println("daemon thread background process running");
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        MyDaemonThreadExample t1 = new MyDaemonThreadExample("thread 1");
        t1.setDaemon(true);
        t1.start();
        t1.getState();
        System.out.println("I m main thread"+ Thread.currentThread().getName());
    }
}
//Daemon threads run in the background and provide services to user threads (like garbage collection or monitoring tasks).

//Daemon thread lifecycle:
//      JVM will exit when all user threads finish, even if daemon threads are still running.
//      Here, the main thread is the only user thread. Once it finishes, the JVM stops, killing the daemon thread automatically.
//Important rules:
//  You must call setDaemon(true) before start(). Otherwise, IllegalThreadStateException will be thrown.
//  Daemon threads should not be used for critical tasks that need to complete.


//Daemon thread is stopped automatically (even if it’s running an infinite loop)