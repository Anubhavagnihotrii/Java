package threadsss;

public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 30; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
