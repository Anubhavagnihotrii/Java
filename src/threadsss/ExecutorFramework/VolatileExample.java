package threadsss.ExecutorFramework;
class Sharedclass{
    private volatile boolean flag = false;

    public void setFlagTrue() throws InterruptedException {
        Thread.sleep(5000);
        flag=true;
        System.out.println("flag setted to true");
    }

    public void printFlagIfTrue(){
        while (!flag){
            //do Nothing
        }
        System.out.println("flag is true");
    }
}
public class VolatileExample {
    public static void main(String[] args) {
        Sharedclass sharedclass = new Sharedclass();
        Thread writeThread = new Thread(()->{
            try {
                sharedclass.setFlagTrue();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread readThread = new Thread(sharedclass::printFlagIfTrue);
        writeThread.start();
        readThread.start();
    }
}
