package CollectionsFramework.Set.LinkedHashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        // Given an array with duplicate elements
        int[] arr = {1, 4, 5, 5,99,99,8, 6, 6,6, 7,10};

        System.out.println("Elements in array (arr): "+Arrays.toString(arr));

        // Create a LinkedHashSet to store unique elements while preserving insertion order
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();

        // Add elements from the array to the LinkedHashSet to remove duplicates
        for (Integer i : arr) {
            uniqueSet.add(i);
        }

        // Print the unique elements in the LinkedHashSet
        System.out.println("Unique elements using LinkedHashSet: " + uniqueSet);

        // Convert the uniqueSet back to an array (renamed to brr)
        int[] brr = new int[uniqueSet.size()];
        Iterator<Integer> iterator = uniqueSet.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            brr[i] = iterator.next();
            i++;
        }

        // Print the unique elements as an array (brr)
        System.out.println("Unique elements as an array (brr): " + Arrays.toString(brr));

        // Note: The order of elements when iterating through the LinkedHashSet preserves insertion order.
    }
}

