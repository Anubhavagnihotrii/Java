package designPatterns.behavioural.strategy;

public class SmsNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("This contains a way how to send SMS");
        System.out.println("sending sms with text: "+message);
    }
}
