package Leetcode.Easy;

public class MissingNumber {
    public int missingNumberOld(int[] nums) {
        int[] save = new int[nums.length + 1];
        for (int i : nums) {
            save[i] = 1;
        }
        int result = 0;
        for (int i = 0; i < save.length; i++) {
            if (save[i] == 0) {
                result = i;
            }
        }
        return result;
    }

    public int missingNumber(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length + 1; i++) {
            answer += i;
        }
        for (int i : nums) {
            answer -= i;
        }
        return answer;
    }
}
