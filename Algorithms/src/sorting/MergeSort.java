package sorting;

import java.util.Arrays;

public class MergeSort {
    /**
     * It split array in two equal halves and sort them individually and after that merged them to get answer.
     * <p>
     * Complexity Analysis: Time Complexity = O (n log(n)), Space Complexity = O(n)
     * </p>
     *
     * @param a An integer array
     * @return A sorted array after being merged.
     */
    public static int[] sort(int[] a) {
        if (a.length == 0) // Edge Case
            return a;
        if (a.length == 1) // Base Condition.
            return a;
        int mid = a.length / 2;
        int[] left = sort(Arrays.copyOfRange(a, 0, mid));
        int[] right = sort(Arrays.copyOfRange(a, mid, a.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[first.length + second.length];

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                ans[k] = first[i];
                i++;
            } else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        // It may be possible, that anyone array is incomplete, i.e., remains some elements in that one.
        // So we need to also add them in our answer.
        while (i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }
}
