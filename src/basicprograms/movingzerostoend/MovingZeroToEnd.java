package basicprograms.movingzerostoend;



public class MovingZeroToEnd {
        public static void main(String[] args) {
            int[] nums = {0,1,0,3,12};
            for(int i=0;i<nums.length-1;i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }

            for(Integer i:nums)
            {
                System.out.print(i+" ");
            }
        }
}

