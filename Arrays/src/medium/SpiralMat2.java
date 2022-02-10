package medium;

import java.util.Arrays;

//Problem 2 - https://leetcode.com/problems/spiral-matrix-ii/

public class SpiralMat2 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(1)));
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }

    /*
    [[1,2,3],[8,9,4],[7,6,5]]
     */
    public static int[][] generateMatrix(int n) {
//      Edge Case
        if (n == 1) return new int[][]{{1}};

        int[][] ans = new int[n][n];
        int element = 1;

        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            // For first row
            for (int i = colStart; i <= colEnd; i++) {
                ans[rowStart][i] = element;
                element++;
            }
            rowStart++;

            // For last column
            for (int i = rowStart; i <= rowEnd; i++) {
                ans[i][colEnd] = element;
                element++;
            }
            colEnd--;

            // For last row
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    ans[rowEnd][i] = element;
                    element++;
                }
            }
            rowEnd--;

            // For first column
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    ans[i][colStart] = element;
                    element++;
                }
            }
            colStart++;
        }
        return ans;
    }
}
