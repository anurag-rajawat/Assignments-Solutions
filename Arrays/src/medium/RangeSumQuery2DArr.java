package medium;

// https://leetcode.com/problems/range-sum-query-2d-immutable/
public class RangeSumQuery2DArr {
    public static void main(String[] args) {
        int sum = new NumMatrix(
                new int[][]{
                        {3, 0, 1, 4, 2},
                        {5, 6, 3, 2, 1},
                        {1, 2, 0, 1, 5},
                        {4, 1, 0, 1, 7},
                        {1, 0, 3, 0, 5}
                }
        ).sumRegion(2, 1, 4, 3);

        int sum2 = new NumMatrix(
                new int[][]{
                        {3, 0, 1, 4, 2},
                        {5, 6, 3, 2, 1},
                        {1, 2, 0, 1, 5},
                        {4, 1, 0, 1, 7},
                        {1, 0, 3, 0, 5}
                }
        ).sumRegion(1, 1, 2, 2);
        System.out.println(sum);
        System.out.println(sum2);

    }

    // Brute-Force
    static class NumMatrix {
        private int[][] matrix;

        public NumMatrix(int[][] matrix) {
            this.matrix = matrix;
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sum = 0;
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    sum += matrix[i][j];
                }
            }
            return sum;
        }
    }
}