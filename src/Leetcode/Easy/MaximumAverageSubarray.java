package Leetcode.Easy;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return 0;
        }
        int localSum = 0;
        for (int i = 0; i < k; i++) {
            localSum += nums[i];
        }
        double averageMax = localSum;
        for (int i = k; i < nums.length; i++) {
            localSum += nums[i] - nums[i - k];
            averageMax = Math.max(localSum, averageMax);
        }
        return (double) averageMax / k;
    }
}
