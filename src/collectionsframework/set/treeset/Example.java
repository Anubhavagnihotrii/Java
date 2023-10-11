package collectionsframework.set.treeset;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        // Given an array with duplicate elements
        int[] arr = {1, 4, 5, 5, 99, 99, 8, 6, 6, 6, 7, 10};

        System.out.println("Elements in the array (arr): " + Arrays.toString(arr));

        // Create a TreeSet to store unique elements in sorted order
        TreeSet<Integer> uniqueSet = new TreeSet<>();

        // Add elements from the array to the TreeSet to remove duplicates and sort them
        for (Integer i : arr) {
            uniqueSet.add(i);
        }

        // Print the unique elements in the TreeSet
        System.out.println("Unique elements using TreeSet (sorted order): " + uniqueSet);

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

        // Note: The TreeSet automatically removes duplicates and sorts elements in ascending order.
    }
}

