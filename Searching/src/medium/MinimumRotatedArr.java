package medium;

import java.util.Arrays;

// Problem 5: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class MinimumRotatedArr {

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1, 2};
        System.out.println(findMin(a));
    }

    // Method 2: Just sort and return first element.
    public int findMin2(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    // Method 1: Using Binary search
    // Since we know that in a rotated sorted array, there is a pivot, and it's next element
    // is definitely going to be the smallest one.
    public static int findMin(int[] nums) {
        int pivot = findPivot(nums);
        return nums[pivot + 1];
    }

    // This will give the index of pivot element
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
