package medium;

import java.util.Arrays;

// https://leetcode.com/problems/kth-largest-element-in-an-array/
public class KthLargestEleInArr {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
