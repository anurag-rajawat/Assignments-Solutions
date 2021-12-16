package solutions.arrays.easy;

// Problem 5: https://leetcode.com/problems/shuffle-the-array/

public class ShuffleArr {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];

//      Two pointers to create new array of 2n elements and to alternate between
//      and creating a new array.
        int i, j = 0;

        for (i = 0; i < 2 * n; i += 2) {
            ans[i] = nums[j];
            ans[i + 1] = nums[j + n];
            j++;
        }
        return ans;
    }
}
