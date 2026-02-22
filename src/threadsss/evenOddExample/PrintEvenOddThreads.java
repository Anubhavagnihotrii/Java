package threadsss.evenOddExample;

public class PrintEvenOddThreads {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        odd.start();
        even.start();
    }
}
// But there we are using 2 Threads so the issue is Order in which elements will be printed is not guranteed, if we want to maintain the order like 1,2,3..... so we need to use wait() and notify() methods which will act as a shared lock between OddThread and EvenThread  and print the elements in Order.