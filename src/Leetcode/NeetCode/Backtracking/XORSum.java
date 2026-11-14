package Leetcode.NeetCode.Backtracking;


// 1863
public class XORSum {
    public int subsetXORSum(int[] num) {
        return dfs(0, 0, num);
    }

    private int dfs(int i, int total, int[] nums) {
        if (i == nums.length) {
            return total;
        }
        return dfs(i + 1, total ^ nums[i], nums) + dfs(i + 1, total, nums);
    }
}
