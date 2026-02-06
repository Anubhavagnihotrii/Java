package designPatterns.combined.strategyWithFactory;

public class CreditCardPaymentStrategy implements Payment{
    String CardNumber;
    String ExpiryDate;
    String CVV;
    public CreditCardPaymentStrategy(){
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public void setExpiryDate(String expiryDate) {
        ExpiryDate = expiryDate;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    @Override
    public void pay(String amount) {
        System.out.println("Payment with credit card" + getCardNumber() +"for amount " + amount);
    }
}
