package designPatterns.behavioural.strategy;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("This contains a way how to send emails");
        System.out.println("sending message :"+message);
    }
}
