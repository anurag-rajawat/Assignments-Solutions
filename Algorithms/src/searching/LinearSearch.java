package searching;

/**
 * Time Complexity: O(n) on all dataset.
 * <p>Space complexity: O(1)</p>
 */
public class LinearSearch {
    public static boolean searchBool(int[] a, int target) {
        for (int ele : a) {
            if (ele == target) return true;
        }
        return false;
    }

    public static boolean searchBool(int[] a, int target, int start, int end) {
        for (int i = start; i < end; i++) {
            if (a[i] == target) return true;
        }
        return false;
    }

    public static int searchInt(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) return i;
        }
        return -1;
    }

    public static boolean searchInt(int[] a, int target, int start, int end) {
        for (int i = start; i < end; i++) {
            if (a[i] == target) return true;
        }
        return false;
    }

    /**
     * Recursively check whether an array is sorted or not using linear search.
     *
     * @param a      an integer array
     * @param target the target which needs to be found.
     * @param idx    starting index i.e., 0
     * @return Tru if target is present, otherwise False.
     */
    private static boolean recLinearSearch(int[] a, int target, int idx) {
        if (a.length == 0) return false;
        if (a.length == 1) return true;
        if (idx == a.length) return false;
        if (a[idx] == target) return true;
        return recLinearSearch(a, target, idx + 1);
    }

    // For 2D Array
    public static boolean linearSearch(int[][] arr, int target) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == target) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * It searches target element in matrix using linear search.
     * <p>Time Complexity: O(n<sup>2</sup>)</p>
     * <p>Space Complexity: O(1) i.e., Constant</p>
     *
     * @param matrix A 2D integer matrix.
     * @param target the element needs to be checked whether it is present or not.
     * @return The index of target element if present, otherwise [-1,-1].
     */
    public static int[] search2D(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

}
