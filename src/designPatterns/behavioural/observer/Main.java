package designPatterns.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();

        Observer user = new MobileUser();
        Observer secondUser = new TvUser();

        amazon.addObserver(user);
        amazon.addObserver(secondUser);

        amazon.setLatestPhoneAvailable("IPHONE 17 PRO");  // This push

//        amazon.notifyObserver();  // This will allow subscribers to pull the info

        amazon.removeObserver(secondUser);

        System.out.println("===============================");
        amazon.setLatestPhoneAvailable("XYZ Phone");  // this will help to pull latest info as it is available and if they subscribed
    }
}
