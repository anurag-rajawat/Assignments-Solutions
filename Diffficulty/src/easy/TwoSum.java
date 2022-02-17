package easy;

// https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    // Brute force, due to lack of HashMap
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int y = target - x;
                if (nums[j] == y) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
