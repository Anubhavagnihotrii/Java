package BasicPrograms.SetOperations;// Import necessary libraries
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// Define a class named unionOfArrays
public class unionOfArrays {
    public static void main(String[] args) {
        // Create two ArrayLists 'arr' and 'brr' with integer elements
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8));
        ArrayList<Integer> brr = new ArrayList<>(Arrays.asList(0,1,2,3,7,8,98,213));

        // Create a HashSet 'hs' to store unique elements from both ArrayLists
        HashSet<Integer> hs = new HashSet<>();

        // Add all elements from 'arr' and 'brr' to the HashSet 'hs'
        hs.addAll(arr);
        hs.addAll(brr);

        // Create a new ArrayList 'union' to store the union of 'arr' and 'brr'
        ArrayList<Integer> union = new ArrayList<>(hs);

        // Print the resulting union of the two arrays
        System.out.println(union);
    }
}

// Union operation combines two sets, 'arr' and 'brr', to create a new set 'union'
// 'union' contains all unique elements from 'arr' and 'brr', removing duplicates
