package BasicPrograms.ReversingNumber;

public class NumberReverse {
    public static void main(String[] args) {

        int n = 123;  // Original number to be reversed

        System.out.println("Original Number: " + n);

        int rev = 0;  // Variable to store the reversed number

        while (n > 0) {
            int temp = n % 10;        // Extract the last digit of 'n'
            rev = rev * 10 + temp;   // Add 'temp' to the reversed number 'rev' in the appropriate position
            n = n / 10;             // Remove the last digit from 'n' to process the next digit
        }

        System.out.println("Reversed Number: " + rev);  // Print the reversed number
    }
}

