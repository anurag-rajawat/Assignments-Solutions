package easy;

import java.util.HashMap;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(nums[i])) return new int[]{map.get(nums[i]), i};
            map.put(diff, i);
        }
        return new int[]{-1, -1};
    }
}
