package Leetcode.Middle;

public class NumMatrix {
    int[][] prefix;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        this.prefix = new int[rows + 1][columns + 1];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                prefix[row + 1][column + 1] +=
                        matrix[row][column] + prefix[row + 1][column] + prefix[row][column + 1] - prefix[row][column];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefix[row2 + 1][col2 + 1]
                - prefix[row1][col2 + 1]
                - prefix[row2 + 1][col1]
                + prefix[row1][col1];
    }
}