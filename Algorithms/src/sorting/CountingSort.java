package sorting;

import java.util.Arrays;

/**
 * Time Complexity: O(n + k) where n is length of array, and k is input range
 * <p>Space complexity: O(n + k)</p>
 */

// TODO: Modify it to sort negative numbers
public class CountingSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 1, 2, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 7, 5, 2};
        int[] b = {55, 43, 1, 678};
        int[] c = {1};
        int[] d = {};
        int[] e = {2, 1};
        int[] f = {2, 0, 1, 2};

        sort(a, 10);
        sort(b, 700);
        sort(c, 10);
        sort(d, 10);
        sort(e, 10);
        sort(f, 10);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));
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
