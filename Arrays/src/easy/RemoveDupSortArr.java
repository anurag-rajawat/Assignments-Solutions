package easy;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDupSortArr {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        int right = 1;
        while (right < nums.length) {
            if (nums[right] != nums[right - 1]) nums[left++] = nums[right];
            right++;
        }
        return left;
    }
}
