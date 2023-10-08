package BasicPrograms.PlaindromeNumber;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to check whether it is a Palindrome or not: ");
        int x = sc.nextInt();  // Read the input number

        // Store the original number in a separate variable
        int originalNumber = x;
        int reversedNumber = 0;  // Variable to store the reversed number

        // Reverse the number
        while (x > 0) {
            int digit = x % 10;        // Extract the last digit of 'x'
            reversedNumber = reversedNumber * 10 + digit;   // Add 'digit' to the reversed number
            x = x / 10;             // Remove the last digit from 'x' to process the next digit
        }

        // Display the original and reversed numbers
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);

        // Check if the original number and reversed number are the same
        if (originalNumber == reversedNumber) {
            System.out.println("It is a Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        // Close the Scanner
        sc.close();
    }
}
