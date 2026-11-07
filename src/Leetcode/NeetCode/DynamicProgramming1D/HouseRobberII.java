package Leetcode.NeetCode.DynamicProgramming1D;

public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int length = nums.length - 1;
        int[] dp1 = new int[length];
        int[] dp2 = new int[length];

        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0], nums[1]);

        dp2[0] = nums[1];
        dp2[1] = Math.max(nums[1], nums[2]);

        for (int i = 2; i < length; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + nums[i]);
        }

        for (int i = 2; i < length; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + nums[i + 1]);
        }

        return Math.max(dp1[length - 1], dp2[length - 1]);
    }
}
