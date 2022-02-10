package medium;


// Problem 3: https://leetcode.com/problems/find-peak-element/
public class SearchRotArr {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int[] b = {1};
        int target2 = 0;
        System.out.println(search(a, target));
        System.out.println(search(b, target2));

    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If  pivot  is found then we've two ascending arrays
        // So, there are three more cases

        // Case 1
        if (nums[pivot] == target) {
            return pivot;
        }
        // Case 2
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Case 3
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }


    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    private static int findPivot(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // There are 4 cases

            // First case, it means that the middle element is greater than next element,
            // i.e., we're on first sorted part of array and which is our pivot
            if (mid < end && a[mid] > a[mid + 1]) {
                return mid;
            }

            // Second, case
            if (mid > start && a[mid] < a[mid - 1]) {
                return mid - 1;
            }

            // Third case
            if (a[mid] <= a[start]) {
                end = mid - 1;
            } else {
                // Fourth case
                start = mid + 1;
            }
        }
        return -1;
    }
}
