package sorting.hard;

// Problem : https://leetcode.com/problems/first-missing-positive/
// Pretty forward, no need to explain, but we're applying cyclic sort because numbers are in [1, n]
public class FirstMissingPos {
    public int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }
        return nums.length+1;
    }

    private void cyclicSort(int[] nums) {
        for (int i = 0; i < nums.length; ) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int first, int second) {
        int curr = nums[first];
        nums[first] = nums[second];
        nums[second] = curr;
    }
}
