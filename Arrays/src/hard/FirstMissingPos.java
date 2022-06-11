package hard;

// Problem 2 - https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPos {
    // Since the question ask us to do this in O(n) and constant space, so we have to use "Cyclic sort"
    // to sort the given array. And after that we only need to check which element is not at its correct
    // position, if it's then it's our answer.
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1)
                return index + 1;
        }
        return nums.length + 1;
    }



    private static void swap(int[] a, int first, int second) {
        int curr = a[first];
        a[first] = a[second];
        a[second] = curr;
    }
}
