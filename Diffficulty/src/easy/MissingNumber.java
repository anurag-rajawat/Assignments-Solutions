package easy;

// https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public int missingNumber(int[] nums) {
        // checking if element is equal to index
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != i) return i;

        // It may be possible that the element is last
        return nums.length;
    }

    private static void cyclicSort(int[] a) {
        for (int i = 0; i < a.length; ) {
            int correct = a[i];
            if (a[i] < a.length && a[i] != a[correct]) swap(a, i, correct);
            else i++;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int curr = a[i];
        a[i] = a[j];
        a[j] = curr;
    }
}
