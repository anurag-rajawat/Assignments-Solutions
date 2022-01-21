package Algorithms.sorting;

import java.util.Arrays;

/**
 * Time Complexity: O(n + k) where n is length of array, and k is input range
 * <p>Space complexity: O(n + k)</p>
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 1, 2, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 7, 5, 2};
        sort(a, 10);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int range) {
        int[] output = new int[a.length];
        int[] rangeArr = new int[range];
        for (int j : a) {
            rangeArr[j]++;
        }
        for (int i = 1; i < range; i++) {
            rangeArr[i] = rangeArr[i] + rangeArr[i - 1];
        }
        for (int j : a) {
            output[--rangeArr[j]] = j;
        }
        // Copying the sorted array into given array
        System.arraycopy(output, 0, a, 0, a.length);
    }
}
