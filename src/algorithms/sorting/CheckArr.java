package algorithms.sorting;

public class CheckArr {
    /**
     * This will recursively check whether an array is sorted or not in increasing order.
     *
     * @param a     An integer array
     * @param index Starting index
     * @return True if it is sorted otherwise False.
     */
    public static boolean isSorted(int[] a, int index) {
        if (a.length == 0)  //Edge Case
            return true;
        if (index == a.length - 1) // Base Case
            return true;
        return a[index] < a[index + 1] && isSorted(a, index + 1);
    }
}
