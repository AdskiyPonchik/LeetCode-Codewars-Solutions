package Leetcode.Middle;

import java.util.HashMap;

public class CountNicePairs {
    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - rev(nums[i]);
            if (visited.containsKey(key)) {
                counter = (counter + visited.get(key)) % 1_000_000_007;
                visited.put(key, visited.get(key) + 1);
            } else {
                visited.put(key, 1);
            }
        }
        return counter;
    }

    private int rev(int num) {
        int result = 0;
        while (num != 0) {
            result = (result * 10) + num % 10;
            num /= 10;
        }
        return result;
    }
}
