package threadsss.evenOddExample.waitNotifyExample;

public class Printer {
    private boolean isOddTurn = true;
    synchronized void printOdd(int n) throws InterruptedException {
        while(!isOddTurn){
            wait();
        }
        System.out.println(n);
        isOddTurn = false;
        notify(); // wakeup even thread
    }
    synchronized void printEven(int n) throws InterruptedException {
        while(isOddTurn){
            wait();
        }
        System.out.println(n);
        isOddTurn = true;
        notify();   // wakeup odd thread
    }
}
