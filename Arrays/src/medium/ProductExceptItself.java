package medium;

import java.util.Arrays;

// Problem 5 - https://leetcode.com/problems/product-of-array-except-self/
public class ProductExceptItself {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int product = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            ans[j] = product * ans[j];
            product *= nums[j];
        }
        return ans;
    }
}
