package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int threeSum = nums[i] + nums[left] + nums[right];
                if (threeSum > 0) right--;
                else if (threeSum < 0) left++;
                else {
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[left]);
                    inner.add(nums[right]);
                    res.add(inner);
                    left++;
                    // This is for handling duplicate values
                    while (nums[left] == nums[left - 1] && left < right) left++;
                }
            }
        }

        return res;
    }
}