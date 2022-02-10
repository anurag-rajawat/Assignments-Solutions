package medium;

import java.util.Arrays;

// Problem 15: https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateNum {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(a));
    }

    // Method 1: Brute-force approach
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int[] count = new int[nums[nums.length - 1] + 1];


        for (int i = 0; i < count.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 0; i <= count.length - 1; i++) {
            if (count[i] >= 2) {
                return i;
            }
        }
        return -1;
    }

//    public static int findDuplicate2(int[] nums) {
//
//    }
}
