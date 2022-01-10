package searching.medium;

import java.util.Arrays;

// GeeksForGeeks Problem
// Given a rotated sorted array, you've to return how many times the array is rotated?
public class CountRotation {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
//        Arrays.sort(a); // If array is sorted
        System.out.println(rotations(a));
    }

    private static int rotations(int[] a) {
        int pivot = findPivot(a);
        return pivot + 1;
    }

    private static int findPivot(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // There are 4 cases

            // First case, it means that the middle element is greater than next element,
            // i.e., we're on first sorted part of array and which is our pivot
            if (mid < end && a[mid] > a[mid + 1]) {
                return mid;
            }

            // Second, case
            if (mid > start && a[mid] < a[mid - 1]) {
                return mid - 1;
            }

            // Third case
            if (a[mid] <= a[start]) {
                end = mid - 1;
            } else {
                // Fourth case
                start = mid + 1;
            }
        }
        return -1;
    }
}

