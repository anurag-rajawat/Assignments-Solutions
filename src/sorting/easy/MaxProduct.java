package sorting.easy;

import java.util.Arrays;

// Problem 10: https://leetcode.com/problems/maximum-product-of-three-numbers/
public class MaxProduct {
    public static void main(String[] args) {
        int[] a = {-100, -98, -1, 2, 3, 4}, b = {1, 2, 3, 4};
//        System.out.println(maximumProduct(a));
        System.out.println(maximumProduct(b));
    }

    public static int maximumProduct(int[] nums) {
        // Edge Case
        if (nums.length == 3) return nums[0] * nums[1] * nums[2];

        Arrays.sort(nums);

        // if array contains negative numbers
        int product1 = nums[0] * nums[1] * nums[nums.length - 1];

        // if array contains positive nums
        int product2 = nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];

        // Since we've to return maximum product
        return Math.max(product1, product2);
    }
}
