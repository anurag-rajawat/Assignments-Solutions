package easy;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquareSortedArr {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {

        Arrays.sort(nums);
        return nums;
    }
}
