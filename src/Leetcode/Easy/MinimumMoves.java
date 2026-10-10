package Leetcode.Easy;

public class MinimumMoves {
    public int minimumMoves(String s) {
        int result = 0;
        int leftIndex = 0;
        while(leftIndex < s.length()){
            if(s.charAt(leftIndex) == 'X'){
                result++;
                leftIndex+=3;
            }
            else{
                leftIndex++;
            }
        }
        return result;
    }
}
