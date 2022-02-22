package easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllNumsDisappArr {
    // Because of range given in question i.e., [1, n] so we can use cyclic sort to get most optimal solution
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // First sort the array
        for (int i = 0; i < nums.length; ) {
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]) swap(nums, i, correctIdx);
            else i++;
        }

        // Disappeared elements
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] != idx + 1) ans.add(idx + 1);
        }
        return ans;
    }

    public static void swap(int[] a, int i, int j) {
        int curr = a[i];
        a[i] = a[j];
        a[j] = curr;
    }
}
