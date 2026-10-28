package Leetcode.NeetCode.Backtracking;

import java.util.ArrayList;

public class WordSearch {

    int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
    };

    char[] chars;

    public boolean exist(char[][] board, String word) {
        chars = word.toCharArray();
        boolean[][] used = new boolean[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (backtrack(board, used, row, col, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean backtrack(char[][] board, boolean[][] used, int row, int col, int index) {
        if (row >= board.length || row < 0
                || col >= board[0].length || col < 0
                || board[row][col] != chars[index] || used[row][col]) {
            return false;
        }
        if (index == chars.length - 1) {
            return true;
        }
        used[row][col] = true;

        boolean found =
                backtrack(board, used, row + 1, col, index + 1)
                        || backtrack(board, used, row - 1, col, index + 1)
                        || backtrack(board, used, row, col - 1, index + 1)
                        || backtrack(board, used, row, col + 1, index + 1);

        used[row][col] = false;

        return found;
    }
}
