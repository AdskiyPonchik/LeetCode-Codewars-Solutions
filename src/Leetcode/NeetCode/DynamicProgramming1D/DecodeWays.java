package Leetcode.NeetCode.DynamicProgramming1D;


public class DecodeWays {
    public int numDecodings(String s) {
        int length = s.length();
        int[] dp = new int[length + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= length; i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            } else {
                dp[i - 1]++;
            }
            char tens = s.charAt(i - 2);
            char ones = s.charAt(i - 1);
            if (tens == '1' || (tens == '2' && ones <= '6')) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[length];
    }
}
