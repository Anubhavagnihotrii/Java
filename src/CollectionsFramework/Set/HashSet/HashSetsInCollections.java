package CollectionsFramework.Set.HashSet;

import java.util.HashSet;

//n Java, a HashSet is a part of the Java Collections Framework and is one of the implementations of the Set interface. It represents a collection of unique elements, meaning that it cannot contain duplicate values.

public class HashSetsInCollections {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, won't be added

        // Check if an element exists in the HashSet
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Iterate through the elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
//      The order of elements when iterating through the HashSet may vary.
    }
}
