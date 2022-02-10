package easy;

import java.util.Arrays;

// Problem 4 - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum2 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 4, 9, 56, 90};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = {-1, -1};
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            if (numbers[start] + numbers[end] == target) {
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else end--;
        }
        return ans;
    }
}