package Leetcode.NeetCode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePart {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, String s, List<String> currentList,
                           List<List<String>> result) {
        if (s.isEmpty()) {
            return;
        }
        if (start == s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isPalintrome(s, start, i)) {
                currentList.add(s.substring(start, i + 1));
                backtrack(i + 1, s, currentList, result);
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    private boolean isPalintrome(String s, int start, int end) {
        int n = s.length();
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
