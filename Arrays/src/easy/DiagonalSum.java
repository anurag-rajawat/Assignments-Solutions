package easy;

//Problem 15 - https://leetcode.com/problems/matrix-diagonal-sum/
public class DiagonalSum {
    public  int diagonalSum(int[][] mat) {
        int sum = 0;
        int center = mat.length / 2;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length - i - 1];
        }

//      Just checking if matrix length is even or odd
        if ((mat.length & 1) != 0) sum -= mat[center][center];
        return sum;
    }
}
