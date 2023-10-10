package basicprograms.setoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Difference {
    public static void main(String[] args) {
        // Create a List 'arr' and initialize it with some values
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Create a ArrayList 'brr' and initialize it with values you want to remove
        List<Integer> brr = new ArrayList<>(Arrays.asList(1, 2));

        // Create a copy of 'arr' to avoid modifying the original list
        List<Integer> result = new ArrayList<>(arr);

        // Remove all elements from 'result' that are present in 'brr'
        result.removeAll(brr);

        // Print the resulting List 'result' after removal
        System.out.println(result);
    }
}
