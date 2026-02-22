package threadsss.evenOddExample.waitNotifyExample;

public class EvenThread extends Thread{
    Printer printer;
    public EvenThread(Printer printer) {
        this.printer = printer;
    }
    @Override
    public void run() {
        for (int i = 2; i <= 50; i+=2) {
            try {
                printer.printEven(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
