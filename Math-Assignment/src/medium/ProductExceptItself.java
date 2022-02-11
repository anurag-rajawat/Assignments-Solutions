package medium;

// Problem 10: https://leetcode.com/problems/product-of-array-except-self/
public class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
//        System.out.println(Arrays.toString(ans));
        int product = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            ans[j] = product * ans[j];
            product *= nums[j];
        }
        return ans;
    }
}
