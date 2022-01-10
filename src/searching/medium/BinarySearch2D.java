package searching.medium;

// Problem 12: https://leetcode.com/problems/search-a-2d-matrix/
public class BinarySearch2D {
    // Although the name of problem is binary search 2D, I'm doing linear search, and it runs in 0ms
    // that's why I'm including this approach in my solution
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == target)
                    return true;
            }
        }
        return false;
    }
}
