package CollectionsFramework.Maps;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacterUsingHashMaps {
    public static void main(String[] args) {

        // Suppose we are given a String, and we need to find the frequency of characters using HashMap.
        String s1 = "Anubhav is Awesome";

        HashMap<Character, Integer> hm = new HashMap<>();

        // Loop through each character in the input String.
        for (Character c : s1.toCharArray()) {
            if (hm.containsKey(c)) {
                // If the character is already in the HashMap, increment its frequency.
                hm.put(c, hm.get(c) + 1);
            } else {
                // If the character is not in the HashMap, add it with a frequency of 1.
                hm.put(c, 1);
            }
        }

        // Print the character frequencies.
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " Frequency: " + entry.getValue());
        }
    }
}
