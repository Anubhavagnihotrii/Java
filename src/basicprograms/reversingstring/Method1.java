package basicprograms.reversingstring;

public class Method1 {
    public static void main(String[] args) {
        // Input string to be reversed
        String inputString = "Anubhav is Awesome";

        // Convert the input string to a character array
        char[] charArray = inputString.toCharArray();

        // Initialize an empty string to store the reversed string
        String reversedString = "";

        // Iterate through the character array in reverse order
        for (int i = charArray.length - 1; i >= 0; i--) {
            // Append each character to the reversedString
            reversedString += charArray[i];
        }

        // Print the reversed string
        System.out.println(reversedString);
    }
}
