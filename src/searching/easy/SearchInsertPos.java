package searching.easy;

// Problem 9:
public class SearchInsertPos {
    public int searchInsert(int[] nums, int target) {
        // Edge Cases
        if (target > nums[nums.length - 1]) return nums.length;
        if (target < nums[0]) return 0;
        int start = 0, end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                start = mid + 1;
                ans = mid + 1;
            } else {
                end = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
}
