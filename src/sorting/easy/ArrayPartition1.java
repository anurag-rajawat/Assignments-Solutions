package sorting.easy;

import java.util.Arrays;

// Problem 9: https://leetcode.com/problems/array-partition-i/submissions/
public class ArrayPartition1 {
    // Method 1: Not so good
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
