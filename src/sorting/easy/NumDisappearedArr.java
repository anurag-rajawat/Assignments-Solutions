package sorting.easy;

import java.util.ArrayList;
import java.util.List;

// Problem 28: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class NumDisappearedArr {
    // Use cycle sort, because the numbers are in the range of [1,n]
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // Sorting the array
        for (int i = 0; i < nums.length; ) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Finding the disappeared element
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    private static void swap(int[] nums, int first, int second) {
        int curr = nums[first];
        nums[first] = nums[second];
        nums[second] = curr;
    }
}
