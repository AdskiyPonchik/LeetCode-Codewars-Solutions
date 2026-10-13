package Leetcode.Middle;

import java.util.*;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int frequency = nums.length / 3;
        List<Integer> result = new ArrayList<>();
        for (int i : nums) {
            int amount = hashMap.getOrDefault(i, 0);
            hashMap.put(i, amount + 1);
        }
        for (int i : hashMap.keySet()) {
            if (hashMap.get(i) > frequency) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> majorityElementTrick(int[] nums) {
        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;
        int frequency = nums.length / 3;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        List<Integer> result = new ArrayList<>();

        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }

        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }
}
