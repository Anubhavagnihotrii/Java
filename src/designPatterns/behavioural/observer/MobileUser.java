package designPatterns.behavioural.observer;

public class MobileUser implements Observer{
    @Override
    public void getNotification(String message) {
        System.out.println("MobileUser: " + message);
    }
}
