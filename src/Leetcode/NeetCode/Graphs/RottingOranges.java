package Leetcode.NeetCode.Graphs;

import java.util.ArrayDeque;
import java.util.Deque;

public class RottingOranges {

    record Cell(int row, int col) {
    }

    Cell[] directions = {
            new Cell(-1, 0),//north
            new Cell(1, 0),//south
            new Cell(0, -1),//west
            new Cell(0, 1)//east
    };

    public int orangesRotting(int[][] grid) {
        int result = 0;
        int fresh = 0;
        Deque<Cell> queue = new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Cell(i, j));
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        while (!queue.isEmpty() && fresh > 0) {
            int layerSize = queue.size();

            for (int i = 0; i < layerSize; i++) {
                Cell cell = queue.removeFirst();
                for (Cell smallCell : directions) {
                    int row = cell.row() + smallCell.row();
                    int col = cell.col() + smallCell.col();
                    if (row >= 0 && row < grid.length &&
                            col >= 0 && col < grid[0].length &&
                            grid[row][col] == 1) {
                        grid[row][col] = 2;
                        fresh--;
                        queue.add(new Cell(row, col));
                    }
                }
            }
            result++;
        }
        return fresh == 0 ? result : -1;
    }
}
