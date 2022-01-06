package searching.easy;

// Problem 17 - https://leetcode.com/problems/binary-search/
public class BinarySearch1 {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        // Target doesn't exist
        return -1;
    }
}
