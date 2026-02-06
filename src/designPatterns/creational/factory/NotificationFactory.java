package designPatterns.creational.factory;

public class NotificationFactory {
        Notification createNotification(String type) {
            if(type.equalsIgnoreCase("email")){
                return new EmailNoti();
            } else if(type.equalsIgnoreCase("whatsapp")){
                return new WhatsappNoti();
            }else {
                return null;
            }
        }
}
