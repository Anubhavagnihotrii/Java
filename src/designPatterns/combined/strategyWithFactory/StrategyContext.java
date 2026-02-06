package designPatterns.combined.strategyWithFactory;

public class StrategyContext {
    private Payment payment;

    public StrategyContext(Payment payment) {
        this.payment = payment;
    }

    public void setPaymentContext(Payment payment) {
        this.payment = payment;
    }

    public void doPayment(String amount) {
        payment.pay(amount);
    }
}
