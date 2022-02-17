package easy;// https://leetcode.com/problems/maximum-subarray/

public class MaxSubArr {
    public int maxSubArray(int[] nums) {
        int  maxSub = nums[0];
        int currSum = 0;

        for(int num: nums){
            if(currSum < 0) currSum = 0;
            currSum += num;
            maxSub = Math.max(currSum, maxSub);
        }

        return maxSub;
    }
}
