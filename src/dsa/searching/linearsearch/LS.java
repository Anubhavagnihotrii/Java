package searching.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class LS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,50,60,70,80};
        System.out.println("Array elements are :- "+ Arrays.toString(arr));
        LinearSearch ls1 = new LinearSearch();
        int x = ls1.linearSearch(arr,50);

        if(x==-1)
        {
            System.out.println("Element not found/ not present in the array");
        }
        else
        {
            System.out.println("Element is at position "+x);
        }
        sc.close();
    }
}
