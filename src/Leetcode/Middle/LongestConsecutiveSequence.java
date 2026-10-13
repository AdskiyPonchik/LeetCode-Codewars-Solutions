package Leetcode.Middle;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            numbers.add(num);
        }

        int longest = 0;

        for (int number : numbers) {
            if (!numbers.contains(number - 1)) {
                int length = 1;

                while (numbers.contains(number + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
