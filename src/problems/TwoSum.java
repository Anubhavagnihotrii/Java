package problems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSumPointerApproach(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredNum= target-nums[i];
            if(map.containsKey(requiredNum)){
                return new int[]{map.get(requiredNum),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static int[] twoSumPointerApproach(int[] nums, int target){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(target== nums[i]+nums[j]){
                return  new int[] {i,j};
            } else if (target > nums[i]+nums[j]) {
                i++;
            }else {
                j--;
            }
        }
        return new int[]{};
    }
}
