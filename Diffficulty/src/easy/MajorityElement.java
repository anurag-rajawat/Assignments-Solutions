package easy;

import java.util.Arrays;

// https://leetcode.com/problems/majority-element/
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length / 2;
        return nums[n];
    }
}
