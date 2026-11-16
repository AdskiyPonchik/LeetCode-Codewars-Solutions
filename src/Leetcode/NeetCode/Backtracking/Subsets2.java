package Leetcode.NeetCode.Backtracking;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, new ArrayList<>(), nums, result);
        return result;
    }

    private void backtrack(int startIndex, List<Integer> current, int[] nums, List<List<Integer>> result){
        if(startIndex == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        int next = startIndex+1;
        current.add(nums[startIndex]);
        backtrack(startIndex+1, current, nums, result);
        while(next < nums.length && nums[next] == nums[startIndex]){
            next++;
        }
        current.remove(current.size() - 1);
        backtrack(next, current, nums, result);
    }
}

