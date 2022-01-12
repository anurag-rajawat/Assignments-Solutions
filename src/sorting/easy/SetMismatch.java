package sorting.easy;

// Problem 29: https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    //Same approach as previous one because here range is also same. i.e., [1, n]
    // So, we've to use cyclic sort
    public int[] findErrorNums(int[] nums) {
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};
            }
        }
        return new int[]{-1, -1};
    }

    private void cyclicSort(int[] a) {
        for (int i = 0; i < a.length; ) {
            int correct = a[i] - 1;
            if (a[i] != a[correct]) {
                swap(a, i, correct);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] a, int first, int second) {
        int curr = a[first];
        a[first] = a[second];
        a[second] = curr;
    }
}
