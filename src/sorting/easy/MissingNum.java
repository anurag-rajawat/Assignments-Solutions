package sorting.easy;

// Problem 4: https://leetcode.com/problems/missing-number/
public class MissingNum {
    // Here is a hint given in the question, which is range of numbers [0, n], also LeetCode asks us to implement a solution using only O(1)
    // extra space complexity and O(n) runtime complexity?
    // And all these constraints are satisfied by "Cyclic Sort"
    // So, now sort using cyclic sort, and check whose index is not equal to value, and which will be our required answer.
    public static int missingNumber(int[] nums) {
        cyclicSort(nums);
        // checking if element is equal to index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        // It may be possible that the element is last
        return nums.length;
    }

    private static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int curr = nums[first];
        nums[first] = nums[second];
        nums[second] = curr;
    }
}
