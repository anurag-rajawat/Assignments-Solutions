package sorting.easy;

// Problem 1: https://leetcode.com/problems/merge-sorted-array/
public class mergeSortedArr {

    // Just merge using merge sort
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m + n];
        int i, j, k;
        i = j = k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[k] = nums1[i++];
            } else {
                ans[k] = nums2[j++];
            }
            k++;
        }
        while (i < m) {
            ans[k++] = nums1[i++];
        }
        while (j < n) {
            ans[k++] = nums2[j++];
        }
        // Now copying the elements of ans array into num1 because LeetCode asks us to do that
        for (int index = 0; index < ans.length; index++) {
            nums1[index] = ans[index];
        }
    }
}
