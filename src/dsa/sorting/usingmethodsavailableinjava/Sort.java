package dsa.sorting.usingmethodsavailableinjava;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr ={90,1,75,4,6,1,3,4,2,999,34,54,56,91};

        System.out.println("Before Sorting :- "+Arrays.toString(arr));

        Arrays.sort(arr);

//        we are using Arrays class to sort the above array(arr), by importing Arrays Class we can use methods associated with it
//        To import the above class write :-   import java.util.Arrays;

        System.out.println("After Sorting :- "+Arrays.toString(arr));

//        The Arrays class is member of the Java Collections Framework.
    }
}
