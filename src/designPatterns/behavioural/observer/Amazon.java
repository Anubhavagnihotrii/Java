package designPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

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
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(()->{
            for(Observer observer : observers){
                observer.getNotification(latestPhoneAvailable);
            }
        },2,5,TimeUnit.SECONDS);
        try {
            scheduler.awaitTermination(25,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            scheduler.shutdown();
        }
    }

    public void setLatestPhoneAvailable(String latestPhoneAvailable) {
        this.latestPhoneAvailable = latestPhoneAvailable;
        notifyObserver();
    }
}
