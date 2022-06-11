package medium;

import java.util.Arrays;

//Problem 8 - https://leetcode.com/problems/rotate-array/
public class RotateArr {
    /*
    Approach: Reverse based;
    Step 1: Reverse original list
    Step 2: Reverse first k numbers
    Step 3: Reverse last length-k elements
     */
    public static void rotate(int[] nums, int k) {
        k %= nums.length; // If k is 0 or greater than nums length.
        reverse(nums, 0, nums.length - 1);  // Step 1
        reverse(nums, 0, k - 1);            // Step 2
        reverse(nums, k, nums.length - 1);  // Step 3
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int curr = nums[start];
            nums[start] = nums[end];
            nums[end] = curr;
            start++;
            end--;
        }
    }
}
