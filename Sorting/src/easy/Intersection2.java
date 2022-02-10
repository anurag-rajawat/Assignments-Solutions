package easy;

import java.util.Arrays;

// Problem 6: https://leetcode.com/problems/intersection-of-two-arrays-ii/
// This is also same problem of searching Intersection of two arrays 2
public class Intersection2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // We've to sort arrays so that we can apply binary search
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Three pointers to make changes and keep track of elements.
        // i and j for comparing elements and k for updating elements.
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}