package Leetcode.NeetCode.Backtracking;

import Leetcode.Additional.ArraysAndHashing.AreNumbersAscending;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(0, 0, n, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int open, int close, int n, StringBuilder current, List<String> result) {
        if (close == n) {
            result.add(current.toString());
            return;
        }
        if (open < n) {
            current.append("(");
            backtrack(open + 1, close, n, current, result);
            current.deleteCharAt(current.length() - 1);
        }
        if (close < open) {
            current.append(")");
            backtrack(open, close + 1, n, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
