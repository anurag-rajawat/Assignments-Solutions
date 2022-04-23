package easy;

// Problem 24 - https://leetcode.com/problems/maximum-subarray/
public class MaxSubArray {
    // This problem will be done by dynamic programming when I learned it.
    // It is using "Kadane's Algorithms" or many ways to solve it.
    // Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
}
