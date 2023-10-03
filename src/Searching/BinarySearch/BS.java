package Searching.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,50,60,70,80};
        System.out.println("Array elements are :- "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After sorting array :- "+Arrays.toString(arr));
        BinarySearch bs1 = new BinarySearch();
        int x= bs1.binarySearch(arr,30)+1;
        System.out.println("Position of target element is "+x);
        sc.close();
    }
}

//    The input array must be sorted in ascending or descending order. Binary search works by repeatedly dividing the array in half, and this division process relies on the order of elements.