package Leetcode.NeetCode.ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            count += hashMap.getOrDefault(sum - k, 0);
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
