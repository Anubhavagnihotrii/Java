package designPatterns.combined.strategyWithFactory;

public class PaymentFactory {

    static Payment getInitialPaymentTypeInfo(String choice){
        switch (choice) {
            case "1":
                return new CreditCardPaymentStrategy();
            case "2":
                return new UpiPaymentStrategy();
            default:
                throw new IllegalArgumentException("Invalid payment type");
        }
    }

}
