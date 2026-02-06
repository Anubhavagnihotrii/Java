package designPatterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        NotificationStrategyContext strategy = new NotificationStrategyContext(new EmailNotification());
        strategy.sendNotification("This emails is sent using email strategy");

        strategy.setNotificationStrategy(new SmsNotification());
        strategy.sendNotification("This sms is sent using sms strategy");
    }
}
