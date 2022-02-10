package easy;

import java.util.Arrays;

// Problem 12: https://leetcode.com/problems/sort-array-by-parity-ii/
public class SortArrParity2 {
    public static void main(String[] args) {
        int[] a = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(a)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int even = 0; // Even pointer for inserting element at even position
        int odd = 1; // Odd  pointer for inserting element at odd position

        // if element is even
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[even] = num;
                even += 2;
            }
        }

        // if element is odd
        for (int num : nums) {
            if (num % 2 != 0) {
                ans[odd] = num;
                odd += 2;
            }
        }
        return ans;
    }
}
