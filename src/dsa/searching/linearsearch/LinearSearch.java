package dsa.searching.linearsearch;

public class LinearSearch {
    int linearSearch(int[] arr,int ele)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            {
                return i+1;
            }
        }
        return -1;
    }
}
