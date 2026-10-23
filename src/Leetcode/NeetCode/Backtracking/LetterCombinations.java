package Leetcode.NeetCode.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    private static final Map<Character, String> LETTERS = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        if(digits.isBlank()){
            return new ArrayList<String>();
        }
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[digits.length()];
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(
            String digits,
            int index,
            StringBuilder path,
            List<String> result
    ) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }
        char digit = digits.charAt(index);
        for (char c : LETTERS.get(digit).toCharArray()) {
            path.append(c);
            backtrack(digits, index + 1, path, result);
            path.deleteCharAt(path.length() - 1);
        }
    }
}

