package basicprograms.palindromestring;

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter the string to be checked for palindrome:");

        // Read the input string from the user
        String originalString = sc.nextLine();

        // Convert the input string to a character array
        char[] c = originalString.toCharArray();

        // Initialize an empty string to store the reversed string
        String reversedString = "";

        // Loop through the character array in reverse order to build the reversed string
        for (int i = c.length - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed String: " + reversedString);

        // Check if the original string is equal to its reverse
        if (originalString.equals(reversedString)) {
            System.out.println("It's a Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}
