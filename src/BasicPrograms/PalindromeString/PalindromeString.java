package BasicPrograms.PalindromeString;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter the string to be checked for palindrome:");

        // Read the input string from the user
        String originalString = sc.nextLine();

        // Create a StringBuilder to reverse the original string
        StringBuilder temp = new StringBuilder(originalString);

        // Reverse the string using StringBuilder
        String reversedString = temp.reverse().toString();

        // Check if the original string is equal to the reversed string
        if (originalString.equals(reversedString)) {
            System.out.println("It is a Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

        // Close the scanner to release resources
        sc.close();
    }
}

