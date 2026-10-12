package Leetcode.Middle;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int number = 0;
        int left = 0;
        int mult = 1;
        for (int right = 0; right < nums.length; right++) {
            mult*=nums[right];
            while(mult >= k){
                mult/=nums[left];
                left++;
            }
            number+=right-left+1;
        }
        return number;
    }
}
