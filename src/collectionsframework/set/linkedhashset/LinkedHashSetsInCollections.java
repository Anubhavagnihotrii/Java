package collectionsframework.set.linkedhashset;

import java.util.LinkedHashSet;

// In Java, a LinkedHashSet is a part of the Java Collections Framework and is one of the implementations of the Set interface.
// It represents a collection of unique elements, just like HashSet, but it also maintains the order of insertion.

public class LinkedHashSetsInCollections {
    public static void main(String[] args) {
        // Create a LinkedHashSet of strings
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        fruits.add("Kiwi");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, won't be added
        fruits.add("Banana"); // Duplicate, won't be added

        // Check if an element exists in the LinkedHashSet
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Iterate through the elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // The order of elements when iterating through the LinkedHashSet
        // will be the same as the order of insertion.
    }
}

