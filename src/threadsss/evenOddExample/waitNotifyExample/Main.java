package threadsss.evenOddExample.waitNotifyExample;


public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        OddThread ot = new OddThread(printer);
        EvenThread et  = new EvenThread(printer);
        ot.start();
        et.start();

    }
}
