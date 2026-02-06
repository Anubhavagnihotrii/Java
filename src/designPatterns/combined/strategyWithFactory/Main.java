package designPatterns.combined.strategyWithFactory;

import java.util.Scanner;
import static designPatterns.combined.strategyWithFactory.PaymentFactory.getInitialPaymentTypeInfo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1: Credit Card | Press 2: UPI");
        String choice = sc.nextLine();


        StrategyContext context = new StrategyContext(getInitialPaymentTypeInfo(choice));

        System.out.println("Enter amount:");
        String amount = sc.nextLine();

        context.doPayment(String.valueOf(amount));
    }
}
