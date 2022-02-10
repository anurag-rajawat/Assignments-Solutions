package medium;

import java.util.Arrays;

// Problem 11: https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateNum {

    // First approach: Brute-force
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
