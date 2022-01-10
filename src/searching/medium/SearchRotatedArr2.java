package searching.medium;

import java.util.Arrays;

// Problem 4: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class SearchRotatedArr2 {
    // Method 1: Using binary search
    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If  pivot  is found then we've two ascending arrays
        // So, there are three more cases

        // Case 1
        if (nums[pivot] == target) {
            return true;
        }
        // Case 2
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Case 3
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public static boolean binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
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

            if (a[mid] == a[start] && a[mid] == a[end]) {
                // First check that if start or end is pivot or not then skip them otherwise return pivot
                if (a[start] > a[start + 1]) return start;
                start++; // Skipping duplicate if it is not pivot

                if (a[end] < a[end - 1]) return end - 1;
                end--; // Skipping duplicate at end iff it is not pivot
            }
            // At this point left side is sorted, so pivot should be at right
            else if (a[start] < a[mid] || (a[start] == a[mid] && a[mid] > a[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Method 2: Just a trick
    public boolean search2(int[] nums, int target) {
        // First just sort the array, then check target exists or not
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
