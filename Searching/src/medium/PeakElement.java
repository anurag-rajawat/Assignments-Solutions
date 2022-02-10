package medium;

// Problem 6: https://leetcode.com/problems/find-peak-element/
public class PeakElement {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;

            // This check means that we're in the ascending part of the array, that's why we've to check next element
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                // This check means that we're in the descending part of the array, that's why we've to check previous element
                end = mid;
            }
        }
        // At this point, start and end both are same, i.e., we can return any of these.
        return start;
    }
}
