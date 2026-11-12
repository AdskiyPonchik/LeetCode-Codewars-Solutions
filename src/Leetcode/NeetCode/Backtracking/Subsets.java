package Leetcode.NeetCode.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int startindex, int[] nums,List<Integer> current, List<List<Integer>> result){
        if (startindex == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[startindex]);
        backtrack(startindex+1, nums, current, result);
        current.remove(current.size()-1);
        backtrack(startindex+1, nums, current, result);
    }
}
