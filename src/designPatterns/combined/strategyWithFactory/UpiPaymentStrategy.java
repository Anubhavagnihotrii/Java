package designPatterns.combined.strategyWithFactory;

public class UpiPaymentStrategy implements Payment{
    @Override
    public void pay(String amount) {
        System.out.println("Payment with UPI for amount " + amount);
    }
}
