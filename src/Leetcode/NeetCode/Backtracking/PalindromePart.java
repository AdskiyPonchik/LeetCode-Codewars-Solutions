package Leetcode.NeetCode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePart {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int startindex, String s, List<String> current, List<List<String>> result) {
        if (s.isEmpty()) {
            return;
        }
        if (startindex == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = startindex; i < s.length(); i++) {
            if (isPalindrome(s, startindex, i)) {
                current.add(s.substring(startindex, i+1));
                backtrack(i + 1, s, current, result);
                current.remove(current.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        int left = start;
        int right = end;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
