package Leetcode.Easy;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int sumLeft = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sumLeft == sum-sumLeft-nums[i]) {
                return i;
            }
            sumLeft += nums[i];
        }
        return -1;
    }
}
