package Algorithms.sorting;

import java.util.Arrays;

/**
 * Time Complexity: O(d(n + k)) where n is length of array, k is input range and d is no of digits in max of given array
 * <p>Array should not contain negative numbers</p>
 * <p>Space complexity: O(n + k)</p>
 */

// TODO: Modify it to sort negative numbers
public class RadixSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 1, 2, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 7, 5, 2};
        int[] b = {55, 43, 1, 678};
        int[] c = {1};
        int[] d = {};
        int[] e = {2,1};
        int[] f = {2,0,1,2};

        sort(a);
        sort(b);
        sort(c);
        sort(d);
        sort(e);
        sort(f);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));
    }

    public static void sort(int[] a) {
        // Edge case
        if (a.length == 0 || a.length == 1) return;

        // Step 1: Find the maximum element in given array
        int max = getMax(a);

        // Step 2: Apply counting sort for every digit of each element of given array
        // This loop will run for no of digits that maximum no has in the array.
        for (int div = 1; max / div > 0; div *= 10) {
            countingSort(a, div);
        }
    }

    public static void countingSort(int[] a, int div) {
        int[] output = new int[a.length];

        // A single digit always lies in [0, 9], that's why the range is always going to be 1-10
        // In other words, in decimal number system there are only 10 unique digits
        int[] count = new int[10];

        // Counting the occurrences of each digit
        for (int j : a) {
            count[(j / div) % 10]++;
        }

        // This calculates the cumulative sum of array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Taking one element from given array and putting in 'output' array at a particular index using cumulative sum of given array
        for (int i = a.length - 1; i >= 0; i--) {
            output[count[(a[i] / div) % 10] - 1] = a[i];
            count[(a[i] / div) % 10]--;
        }

        // Copy the elements from 'ans' array to given array
        System.arraycopy(output, 0, a, 0, a.length);
    }

    /**
     * @param a an integer array
     * @return Maximum element of given array
     */
    public static int getMax(int[] a) {
        int max = a[0];
        for (int ele : a) {
            if (ele > max) max = ele;
        }
        return max;
    }
}
