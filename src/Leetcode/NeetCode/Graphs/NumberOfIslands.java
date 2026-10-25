package Leetcode.NeetCode.Graphs;

import java.awt.*;
import java.awt.List;
import java.util.*;

public class NumberOfIslands {

    private int rows;
    private int cols;

    Set<Cell> visited = new HashSet<>();
    int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
    };

    record Cell(int row, int col) {
    }

    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        visited.clear();
        rows = grid.length;
        cols = grid[0].length;
        int islands = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !visited.contains(new Cell(i, j))) {
                    bfs(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void bfs(char[][] grid, int row, int col) {
        Deque<Cell> deque = new ArrayDeque<>();
        deque.addLast(new Cell(row, col));
        visited.add(new Cell(row, col));
        while (!deque.isEmpty()) {
            Cell cell = deque.removeFirst();
            for (int[] i : directions) {
                int r = cell.row() + i[0];
                int c = cell.col() + i[1];
                Cell smallCell = new Cell(r, c);
                if (r >= 0 && r < rows &&
                        c >= 0 && c < cols &&
                        grid[r][c] == '1' &&
                        !visited.contains(smallCell)) {
                    deque.addLast(smallCell);
                    visited.add(smallCell);
                }
            }
        }
    }
}
