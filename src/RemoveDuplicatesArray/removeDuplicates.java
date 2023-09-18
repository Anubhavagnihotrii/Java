package RemoveDuplicatesArray;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,4,5,5,5,6,6,7,8};
        int brr[] = new int[arr.length];

        brr[0]=arr[0];
        int j=0;

        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                j++;
                brr[j]=arr[i];
            }
        }
//        System.out.println(Arrays.toString(brr));
        for(int i=0;i<=j;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
}

//here I have taken two array and traversed the 1st array (arr) and put the unique element to the new array(brr) and if the duplicate element is encountered it is ignored.