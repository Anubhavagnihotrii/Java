package Sorting.SelectionSort;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={99,4,63,2,1,3,0,1,2};

        System.out.println("Before Sorting "+ Arrays.toString(arr));

        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After Sorting "+ Arrays.toString(arr));

    }
}
