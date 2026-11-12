package Leetcode.NeetCode.Backtracking;


import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, new ArrayList<>(), result, k, n, 0);
        return result;
    }

    private void backtrack(int index, List<Integer> current, List<List<Integer>> result, int k, int n, int currentSum) {
        if (current.size() == k) {
            if (currentSum == n) {
                result.add(new ArrayList<>(current));
            }
            return;
        }
        if (index > 9) {
            return;
        }

        current.add(index);
        backtrack(index + 1, current, result, k, n, currentSum + index);
        current.remove(current.size() - 1);
        backtrack(index+1, current, result, k, n, currentSum);
    }
}
