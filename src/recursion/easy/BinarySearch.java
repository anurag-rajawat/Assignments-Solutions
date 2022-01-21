package recursion.easy;

// Problem 3: https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public  int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }

    private int binarySearch(int[] a, int target, int start, int end) {
        // Base case
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (a[mid] == target) return mid;

        if (a[mid] < target) {
            return binarySearch(a, target, mid + 1, end);
        }
        return binarySearch(a, target, 0, mid - 1);
    }
}
