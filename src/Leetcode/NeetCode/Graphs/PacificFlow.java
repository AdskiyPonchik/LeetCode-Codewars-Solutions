package Leetcode.NeetCode.Graphs;

import java.util.*;

public class PacificFlow {
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        if (heights.length == 0 || heights[0].length == 0 || heights == null) {
            return new ArrayList<>();
        }
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();

        for (int r = 0; r < rows; r++) {
            pacificQueue.add(new int[]{r, 0});
            atlanticQueue.add(new int[]{r, cols - 1});
            pacific[r][0] = true;
            atlantic[r][cols - 1] = true;
        }

        for (int c = 0; c < cols; c++) {
            pacificQueue.add(new int[]{0, c});
            atlanticQueue.add(new int[]{rows - 1, c});
            pacific[0][c] = true;
            atlantic[rows - 1][c] = true;
        }

        bfs(heights, pacificQueue, pacific);
        bfs(heights, atlanticQueue, atlantic);
        List<List<Integer>> result = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    result.add(Arrays.asList(r, c));
                }
            }
        }

        return result;
    }

    private void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited) {
        int rows = heights.length;
        int cols = heights[0].length;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            for (int[] d : dirs) {
                int newRow = r + d[0];
                int newCol = c + d[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                        && !visited[newRow][newCol]
                        && heights[newRow][newCol] >= heights[r][c]) {
                    visited[newRow][newCol] = true;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }
    }
}
