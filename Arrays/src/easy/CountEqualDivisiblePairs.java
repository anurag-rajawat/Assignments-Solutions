package easy;

// https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
public class CountEqualDivisiblePairs {
    //    TC = O(n^2), SC = O(1)
    public int countPairs(int[] nums, int k) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) count++;
            }
        }
        return count;
    }
}
