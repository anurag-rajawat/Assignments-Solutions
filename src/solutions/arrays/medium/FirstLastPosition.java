package solutions.arrays.medium;

import java.util.Arrays;

// Problem 6 - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstLastPosition {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = binarySearch(nums, target, true);
        int end = binarySearch(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    private static int binarySearch(int[] nums, int target, boolean isStartIndex) {
        int ans = -1;

        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] == target) {
                ans = mid;
                if (isStartIndex)
                    end = mid - 1;
                else start = mid + 1;

            } else if (nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] > target)
                end = mid - 1;
        }
        return ans;
    }
}
