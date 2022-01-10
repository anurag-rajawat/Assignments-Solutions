package searching.hard;

// Problem 1: https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianTwoArr {
    // First merge two arrays using "Merge Sort" then find median just simple.
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int len1 = nums1.length, len2 = nums2.length;
        int[] a = new int[len1 + len2];

        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                a[k++] = nums1[i++];
            } else {
                a[k++] = nums2[j++];
            }
        }
        while (i < len1) {
            a[k++] = nums1[i++];
        }
        while (j < len2) {

            a[k++] = nums2[j++];
        }
        int mid = (len1 + len2) / 2;
        if ((len1 + len2) % 2 == 0) {
            return ((double) a[mid - 1] + a[mid]) / 2;

        }
        return a[mid];
    }
}
