package easy;

import java.util.Arrays;

// Problem 7: https://leetcode.com/problems/maximum-product-of-three-numbers/
public class MaxProThreeNums {
    public int maximumProduct(int[] nums) {
        // Edge Case
        if (nums.length == 3) return nums[0] * nums[1] * nums[2];

        Arrays.sort(nums);

        int product1 = nums[0] * nums[1] * nums[nums.length - 1];
        int product2 = nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];

        // Since we've to return maximum product
        return Math.max(product1, product2);
    }
}
