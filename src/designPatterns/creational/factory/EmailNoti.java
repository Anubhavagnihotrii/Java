package designPatterns.creational.factory;

public class EmailNoti implements Notification{
    @Override
    public void send(String message) {
        System.out.println("sending Email notification with text: "+message);
    }
}
