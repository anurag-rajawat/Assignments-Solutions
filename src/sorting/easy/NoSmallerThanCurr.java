package sorting.easy;

// Problem 21: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/
public class NoSmallerThanCurr {
    // Not so good
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        // Adding count of smaller numbers than current number in ans array
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
