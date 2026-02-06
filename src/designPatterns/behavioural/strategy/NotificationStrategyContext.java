package designPatterns.behavioural.strategy;

public class NotificationStrategyContext {
    private Notification notification;

    public NotificationStrategyContext(Notification notification){
        this.notification = notification;
    }
    public void setNotificationStrategy(Notification notification){
        this.notification = notification;
    }
    public void sendNotification(String message){
        notification.send(message);
    }
}
