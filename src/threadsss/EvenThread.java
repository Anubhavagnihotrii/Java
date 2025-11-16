package threadsss;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i < 30; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
