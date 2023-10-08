package ReversingString;

public class Method2 {
    public static void main(String[] args) {
        // Input string to be reversed
        String s1 = "Anubhav is Awesome";

        // Create a StringBuffer object and initialize it with the input string
        StringBuffer s2 = new StringBuffer();
        s2.append(s1);

        // Print the original string
        System.out.println("Original String: " + s2);

        // Reverse the StringBuffer and print the reversed string
        System.out.println("Reversed String: " + s2.reverse());
    }
}
