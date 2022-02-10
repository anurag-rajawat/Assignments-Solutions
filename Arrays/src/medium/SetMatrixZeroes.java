package medium;

import java.util.HashSet;
import java.util.Set;

//Problem 4 - https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        int[][] b = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
//        setZeroes(a);
//        setZeroes(b);
//        setZeroes2(a);
//        setZeroes2(b);
        for (int[] row : a) {
            for (int ele : row) System.out.print(ele + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int[] row : b) {
            for (int ele : row) System.out.print(ele + " ");
            System.out.println();
        }
    }

    /**
     * Approach 1: Additional Memory Approach
     * If any cell of the matrix has a zero we can record its row and column number. All the cells of this recorded row and column can be marked zero in the next iteration.
     * <p>
     * Algorithm
     * <p>
     * We make a pass over our original array and look for zero entries.
     * <p>
     * If we find that an entry at [i, j] is 0, then we need to record somewhere the row i and column j.
     * <p>
     * So, we use two sets, one for the rows and one for the columns.
     */

    public static void setZeroes(int[][] matrix) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

//      Marking rows and cols that are made to be zero
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

//        Iterating and updating the elements
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void setZeroes2(int[][] matrix) {
        boolean isCol = false;
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        for (int i = 0; i < totalRows; i++) {
            if (matrix[i][0] == 0) {
                isCol = true;
            }

            for (int j = 1; j < totalCols; j++) {
                // If an element is zero, we set the first element of the corresponding row and column to 0
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

//         Iterate over array once again and using the first row and first column, update the element.
        for (int i = 1; i < totalRows; i++) {
            for (int j = 1; j < totalCols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

//       See if first row needs to be set zero as well
        if (matrix[0][0] == 0) {
            for (int j = 0; j < totalCols; j++) {
                matrix[0][j] = 0;
            }
        }

//         Check column needs to be set zero or not
        if (isCol) {
            for (int i = 0; i < totalRows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
