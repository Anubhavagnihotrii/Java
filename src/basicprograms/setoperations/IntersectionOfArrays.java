package basicprograms.setoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        // Create two ArrayLists
        List<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> brr = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 7, 8, 98, 213));

        // Method 1: Using ArrayList retainAll method (less efficient)
        List<Integer> intersection = new ArrayList<>(arr); // Create a copy of arr
        intersection.retainAll(brr); // Retain only common elements with brr

        System.out.println("Intersection using ArrayList retainAll method: " + intersection);

        // Method 2: Using HashSet (more efficient)
        List<Integer> intersection2 = findIntersectionUsingHashSet(arr, brr);

        System.out.println("Intersection using HashSet: " + intersection2);
    }

    // Function to find the intersection of two ArrayLists using HashSet
    public static List<Integer> findIntersectionUsingHashSet(List<Integer> list1, List<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);

        // Intersection is stored in result
        set1.retainAll(set2);

        return new ArrayList<>(set1);
    }
}
