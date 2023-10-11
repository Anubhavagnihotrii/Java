package basicprograms.factorial;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt();
        sc.close();

        int factorial = calculateFactorial(n);

        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    // Function to calculate factorial
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
