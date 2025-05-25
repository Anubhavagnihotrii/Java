package searching.recursiveBinarySearch;

public class RecursiveBinarySearch {
    public  static int  recursiveBS(int[] arr, int target, int start, int end){
        if(end>=start){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return  mid;
            }
            if(arr[mid]<target){
                return recursiveBS(arr,target,mid+1,end);
            }
            return  recursiveBS(arr,target,start,mid-1);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,78,89,90,99};
        int target=7;
        int index = recursiveBS(arr,target,0, arr.length-1);
        System.out.println("Target Element Present at index : "+index);
    }
}
