package com.miguelvela;

public class Solution {
    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for(int row = 0; row < rows; row++)
        {
            for (int column = 0; column < columns; column++)
            {
                int value = matrix[row][column];
                result[column][row] = value;
            }
        }

        return result;
    }
}
