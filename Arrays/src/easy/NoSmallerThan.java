package easy;

// Problem 8: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

// TODO: Need to be optimized
public class NoSmallerThan {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}
