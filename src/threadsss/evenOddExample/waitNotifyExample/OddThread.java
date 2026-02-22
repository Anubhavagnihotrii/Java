package threadsss.evenOddExample.waitNotifyExample;

public class OddThread extends Thread {
    Printer printer;
    public OddThread(Printer printer) {
        this.printer = printer;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 50; i+=2) {
            try {
                printer.printOdd(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
