package sorting.countsort;

import java.util.Arrays;

//Count Sort is Non-Comparison Algo
//Used for single digit whole numbers
//Time Complexity O(n+k) -> Linear

public class CountSort {

    public  static void countSort(int[]arr){
        int max=arr[0];
        for (int i:arr){
            max= Math.max(max,i);
        }
        System.out.println(max);
        int[] cumCount = new int[max+1];
        // Frequency of each number
        for(int i:arr){
            cumCount[i]++;
        }
        System.out.println(Arrays.toString(cumCount));
        // cumulative count [current = current+previous]
        for(int i=1;i< cumCount.length;i++){
            cumCount[i]+=cumCount[i-1];
        }
        System.out.println(Arrays.toString(cumCount));

        int[] output= new int[arr.length];

        for (int i = arr.length-1; i >=0; i--) {
            output[--cumCount[arr[i]]] = arr[i];
        }
        System.out.println(Arrays.toString(cumCount));
    }
    public static void main(String[] args) {
        int[] arr = {3,5,6,3,3,2,1,5,9};
        countSort(arr);
    }
}
