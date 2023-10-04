package CollectionsFramework.Set.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class example {
    public static void main(String[] args) {
        // Given an array with duplicate elements
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8};

        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueSet = new HashSet<>();

        // Add elements from the array to the HashSet to remove duplicates
        for (Integer element : arr) {
            uniqueSet.add(element);
        }

        // Print the unique elements in the HashSet
        System.out.println("Unique elements using HashSet: " + uniqueSet);

        // Convert the uniqueSet back to an array (renamed to brr)
        int[] brr = new int[uniqueSet.size()];
        Iterator<Integer> iterator = uniqueSet.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            brr[i++] = iterator.next();
        }

        // Print the unique elements as an array (brr)
        System.out.println("Unique elements as an array (brr): " + Arrays.toString(brr));

        //      The order of elements when iterating through the HashSet may vary.

    }
}
