package designPatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        factory.createNotification("email").send("hello");

        Notification whatsappNoti= factory.createNotification("whatsapp");
        whatsappNoti.send("anubhav is awesome");
    }
}
