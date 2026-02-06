package designPatterns.creational.factory;

public class WhatsappNoti implements Notification{
    @Override
    public void send(String message) {
        System.out.println("sending whatsapp notification with text: "+message);
    }
}
