package easy;

import java.util.Arrays;
import java.util.HashSet;

// https://leetcode.com/problems/keep-multiplying-found-values-by-two/
public class KeepMultiplying {

    // Brute-force
    public int findFinalValue1(int[] nums, int original) {
        Arrays.sort(nums);
        while (isPresent(nums, original)) {
            original *= 2;
        }
        return original;
    }

    private boolean isPresent(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return false;
    }

    // Using HashSet
    public int findFinalValue2(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(original)) {
            original *= 2;
        }
        return original;
    }

    // Using Recursion, Best
    public int findFinalValue(int[] nums, int original) {
        int count = 0;
        for (int num : nums) {
            if (num == original) {
                count++;
                original *= 2;
                break;
            }
        }
        if (count == 0) return original;
        return findFinalValue(nums, original);
    }

}
