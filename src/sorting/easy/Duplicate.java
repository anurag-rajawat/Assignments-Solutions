package sorting.easy;

import java.util.Arrays;

// Problem 3: https://leetcode.com/problems/contains-duplicate/
public class Duplicate {
    // Brute-force approach
    // Just sort and check whether i and i+1 elements are equal or not, since there are only duplicates.
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
            if (nums[i] == nums[i - 1]) return true;
        return false;
    }

    // Second approach: Using HashSet, but I don't know about it now, later I'll do it with them
    // with more optimized solution
}
