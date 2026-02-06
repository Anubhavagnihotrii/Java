package problems;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

//  This code finds the single number in an array where every other number appears twice.
//  It uses the XOR operation which has the property that a ^ a = 0 and a ^ 0 = a.

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums)); // Output: 4
        System.out.println(singleNumberUsingHashMap(nums)); // Output: 4
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }

    public static int singleNumberUsingHashMap(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); 
            }
        }
        return -1; // If no single number is found, return -1 (or throw an exception)
    }
}
