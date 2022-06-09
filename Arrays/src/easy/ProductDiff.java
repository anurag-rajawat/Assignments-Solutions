package easy;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
public class ProductDiff {

    // Using sort
    public int maxProductDifferenceUsingSort(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return (nums[len - 1] * nums[len - 2]) - (nums[0] * nums[1]);
    }
}
