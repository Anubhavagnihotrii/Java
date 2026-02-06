package designPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon implements Subject{
    List<Observer> observers = new ArrayList<>();
    private String latestPhoneAvailable;

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.getNotification(latestPhoneAvailable);
        }
    }

    public void setLatestPhoneAvailable(String latestPhoneAvailable) {
        this.latestPhoneAvailable = latestPhoneAvailable;
        notifyObserver();
    }
}
