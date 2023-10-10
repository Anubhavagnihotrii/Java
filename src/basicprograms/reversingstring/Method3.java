package basicprograms.reversingstring;

public class Method3 {
    public static void main(String[] args) {
        // Input string to be reversed
        String s1 = "Anubhav is Awesome";

        // Create a StringBuilder object and initialize it with the input string
        StringBuilder s2 = new StringBuilder(s1);

        // Print the original string
        System.out.println("Original String: " + s2);

        // Reverse the StringBuilder and print the reversed string
        StringBuilder reversedString = s2.reverse();
        System.out.println("Reversed String: " + reversedString);
    }
}
