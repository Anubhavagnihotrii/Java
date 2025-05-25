package searching.binarysearch;

public class BinarySearch {
    int binarySearch(int[] arr,int target)
    {
        int high=arr.length-1;
        int low=0;
        while(low<=high)
        {
//            int mid=(low+high)/2;
            int mid = low + (high-low)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return  -1;
    }
}
