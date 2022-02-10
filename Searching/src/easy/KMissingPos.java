package easy;

// Problem 8 - https://leetcode.com/problems/kth-missing-positive-number/
public class KMissingPos {
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Find the difference between current element at the mid-index
            // and the actual expected value at mid-index
            // If the difference < k, then search right else search left
            if (arr[mid] - (mid + 1) < k) start = mid + 1;
            else end = mid - 1;
        }
        return start + k;
    }
}
