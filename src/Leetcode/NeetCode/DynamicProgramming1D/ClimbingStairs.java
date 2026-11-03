package Leetcode.NeetCode.DynamicProgramming1D;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }
        int iMinus2 = 1;
        int iMinus1 = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = iMinus1 + iMinus2;
            iMinus2 = iMinus1;
            iMinus1 = result;
        }
        return result;
    }
}
