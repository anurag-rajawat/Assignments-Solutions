package medium;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPosArr {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    private int search(int[] a, int target, boolean isStartIndex) {
        int ans = -1;
        int start = 0, end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) {
                ans = mid;
                if (isStartIndex) end = mid - 1;
                else start = mid + 1;
            } else if (a[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return ans;
    }

}
