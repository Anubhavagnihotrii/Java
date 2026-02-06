package designPatterns.behavioural.observer;

public class TvUser implements Observer{
    @Override
    public void getNotification(String message) {
        System.out.println("TV User" + message);
    }
}
