package searching.medium;

// Problem 1: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// This is a duplicate problem, which I've done in Arrays
public class FirstLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    private int search(int[] nums, int target, boolean isStartIndex) {
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
