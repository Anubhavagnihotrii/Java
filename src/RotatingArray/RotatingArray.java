package RotatingArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RotatingArray {
    public static void main(String[] args) {
        // Original array of integers
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Number of positions to rotate the array
        int rotateBy = 2; // You can use a negative value for left rotation

        // Create an ArrayList to work with the array
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Copy elements from the original array to the ArrayList
        for (int i : originalArray) {
            arrayList.add(i);
        }

        // Display the ArrayList before rotating
        System.out.println("ArrayList before rotating: " + arrayList);

        // Rotate the ArrayList by the specified number of positions
        Collections.rotate(arrayList, rotateBy);

        // Display the ArrayList after rotating
        System.out.println("ArrayList after rotating: " + arrayList);

        // Convert the rotated ArrayList back to the original array
        for (int i = 0; i < arrayList.size(); i++) {
            originalArray[i] = arrayList.get(i);
        }

        // Display the original array after conversion
        System.out.println("Original array after rotating: " + Arrays.toString(originalArray));
    }
}
