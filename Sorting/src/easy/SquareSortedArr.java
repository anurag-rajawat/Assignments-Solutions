package easy;

import java.util.Arrays;

// Problem 14: https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
public class SquareSortedArr {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
