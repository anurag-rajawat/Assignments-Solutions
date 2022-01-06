package arrays.easy;

//Problem 15 - https://leetcode.com/problems/matrix-diagonal-sum/
public class DiagonalSum {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 5},
                {7, 8, 9, 6},
                {7, 8, 9, 0}
        };
        System.out.println(diagonalSum(a));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int center = mat.length / 2;
//        System.out.println(mat[center][center]);
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length - i - 1];
        }

//      Just checking if matrix length is even or odd
        if ((mat.length & 1) != 0) sum -= mat[center][center];
        return sum;
    }
}
