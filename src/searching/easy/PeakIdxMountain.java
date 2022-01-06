package searching.easy;

import java.util.Arrays;

// Problem 10 - https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIdxMountain {

    public static void main(String[] args) {
        int[] a = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(peakIndexInMountainArray1(a));
    }

    // Method 1: Using linear search, not good!
    public static int peakIndexInMountainArray1(int[] arr) {
        int[] copyArr = new int[arr.length];
        System.arraycopy(arr, 0, copyArr, 0, arr.length);
        Arrays.sort(arr);
        return search(copyArr, arr[arr.length - 1]);
    }

    private static int search(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) return i;
        }
        return -1;
    }

    // Method 2: Using Binary Search, awesome solution

    // The comparison A[i] < A[i+1] in a mountain array looks like [True, True, True, ..., True, False, False, ..., False]:
    // 1 or more boolean Trues, followed by 1 or more boolean False. For example, in the mountain array [1, 2, 3, 4, 1], the comparisons A[i] < A[i+1]
    // would be True, True, True, False.
    // We can, binary search over this array of comparisons, to find the largest index i such that A[i] < A[i+1]
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
