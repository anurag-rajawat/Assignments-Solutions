package sorting.easy;

// Problem 11: https://leetcode.com/problems/sort-array-by-parity/
public class SortArrParity1 {
    public int[] sortArrayByParity(int[] nums) {
        // Edge case
        if (nums.length == 1) return nums;

        int[] ans = new int[nums.length];
        int i, k = 0;

        // For even nums
        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[k++] = nums[i];
            }
        }
        // For odd nums
        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                ans[k++] = nums[i];
            }
        }

        return ans;
    }
}
