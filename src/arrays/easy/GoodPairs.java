package arrays.easy;

// Problem 7: https://leetcode.com/problems/number-of-good-pairs/

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++)
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
        }
        return count;
    }
}
