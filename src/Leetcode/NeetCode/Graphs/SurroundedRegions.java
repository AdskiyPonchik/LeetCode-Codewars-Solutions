package Leetcode.NeetCode.Graphs;

import java.util.ArrayDeque;
import java.util.Deque;

public class SurroundedRegions {
    record Cell(int row, int col) {
    }

    Cell[] directions = {
            new Cell(-1, 0),//north
            new Cell(1, 0),//south
            new Cell(0, -1),//west
            new Cell(0, 1)//east
    };

    public void solve(char[][] board) {
        boolean[][] safe = new boolean[board.length][board[0].length];
        int rows = board.length;
        int cols = board[0].length;

        for (int col = 0; col < cols; col++) {
            bfs(board, safe, 0, col);
            bfs(board, safe, rows - 1, col);
        }

        for (int row = 0; row < rows; row++) {
            bfs(board, safe, row, 0);
            bfs(board, safe, row, cols - 1);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' && !safe[i][j]) {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void bfs(char[][] board, boolean[][] safe, int row, int col) {
        Deque<Cell> deque = new ArrayDeque<>();
        if (board[row][col] != 'O' || safe[row][col]) return;
        deque.add(new Cell(row, col));
        while (!deque.isEmpty()) {
            Cell cell = deque.removeFirst();
            for (Cell smallCell : directions) {
                int newRow = cell.row() + smallCell.row();
                int newCol = cell.col() + smallCell.col();
                if (newRow >= 0 && newRow < board.length &&
                        newCol >= 0 && newCol < board[0].length &&
                        board[newRow][newCol] == 'O' && !safe[newRow][newCol]) {
                    safe[newRow][newCol] = true;
                    deque.add(new Cell(newRow, newCol));
                }
            }
        }
    }
}
