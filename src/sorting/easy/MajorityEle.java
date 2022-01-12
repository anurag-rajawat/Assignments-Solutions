package sorting.easy;

import java.util.Arrays;

// Problem 2: https://leetcode.com/problems/majority-element/
public class MajorityEle {
    public static void main(String[] args) {
        int[] a = {2, 2, 1, 1, 1, 2, 2}, b = {3, 2, 3};
        System.out.println(majorityElement(a));
        System.out.println(majorityElement(b));
    }

    // First approach
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length / 2;
        return nums[n];
    }

}
