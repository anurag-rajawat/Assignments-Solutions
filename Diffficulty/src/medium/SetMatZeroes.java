package medium;

// https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatZeroes {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.vendor"));
    }
    public void setZeroes(int[][] matrix) {
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
