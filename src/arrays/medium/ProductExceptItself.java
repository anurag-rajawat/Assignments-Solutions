package arrays.medium;

import java.util.Arrays;

// Problem 5 - https://leetcode.com/problems/product-of-array-except-self/
public class ProductExceptItself {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(a)));
        System.out.println(Arrays.toString(productExceptSelf(b)));
    }

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
