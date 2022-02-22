package easy;

// https://leetcode.com/problems/find-pivot-index/
public class PivotIdx {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - nums[i] - leftSum;
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
