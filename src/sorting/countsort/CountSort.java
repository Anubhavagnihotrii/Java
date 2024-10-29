package sorting.countsort;

import java.util.Arrays;

//Count Sort is Non-Comparison Algo
//Used for single digit whole numbers


public class CountSort {
    public static void main(String[] args) {
        int[] arr = {3,5,6,3,3,2,1,5,9};
        int max =arr[0];

        //Finding the maximum value
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
//      System.out.println(max);

        int[]cumulativeCount=new int[max+1];

//      Putting frequency of each element to calculate cumulative count
        for(int i:arr){
            cumulativeCount[i]++;
        }
//        System.out.println(Arrays.toString(cumulativeCount));
//      calculating cumulative count
        for(int i=1;i<cumulativeCount.length;i++){
            cumulativeCount[i]+=cumulativeCount[i-1];
        }
//        System.out.println(Arrays.toString(cumulativeCount));

//      sorting array
        int[] sortedArray = new  int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int val = arr[i];
            int pos = cumulativeCount[val]-1;
            sortedArray[pos]=val;
            cumulativeCount[val]=cumulativeCount[val]-1;
        }
        System.out.println(Arrays.toString(sortedArray));
    }
}
