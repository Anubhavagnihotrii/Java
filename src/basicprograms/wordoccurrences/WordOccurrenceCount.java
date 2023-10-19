package basicprograms.wordoccurrences;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class WordOccurrenceCount {


    public static void main(String[] args) {
        // Input string containing words
        String inputString = "This This is IS Awesome Awesome Awesome Dude dude";

        // Split the string into words by space
        String[] words = inputString.split(" ");

        // Create a HashMap to store words and their occurrences
        HashMap<String, Integer> wordOccurrencesMap = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            if (wordOccurrencesMap.containsKey(word)) {
                // If the word is already present in the HashMap, increment its count
                wordOccurrencesMap.put(word, wordOccurrencesMap.get(word) + 1);
            } else {
                // If the word is not present in the HashMap, add it with an initial count of 1
                wordOccurrencesMap.put(word, 1);
            }
        }

        // Print the word occurrences
        for (Map.Entry<String, Integer> entry : wordOccurrencesMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
