package searching;


/**
 * Time Complexity: O(log n) on all dataset, but array must be sorted.
 * <p>Space complexity: O(1)</p>
 */
public class BinarySearch {
    public static int searchInt(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) return mid;
            else if (a[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static int searchInt(int[] a, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) return mid;
            else if (a[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static boolean searchBool(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) return true;
            else if (a[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    public static boolean searchBool(int[] a, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) return true;
            else if (a[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    // This is recursive binary search.
    public static int recurBinarySearch(int[] a, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + ((end - start) / 2);
        if (a[mid] == target) {
            return mid;
        }
        if (target < a[mid]) {
            return recurBinarySearch(a, target, start, mid - 1);
        }
        return recurBinarySearch(a, target, mid + 1, end);
    }

    public static int orderAgBS(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        boolean isAsc = arr[0] <= arr[arr.length - 1];
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (isAsc) {
                if (arr[mid] > target)
                    end = mid - 1;

                else if (arr[mid] < target)
                    start = mid + 1;
                else return mid;
            } else {
                if (arr[mid] < target)
                    end = mid - 1;

                else if (arr[mid] > target)
                    start = mid + 1;
                else return mid;
            }
        }
        return -1;
    }

    public static int ceilNum(int[] arr, int target) {
        /*
        Ceiling of a number, means find the smallest number in given array
         which must be greater than or equal to target.
         */

        if (target > arr[arr.length - 1])
            return -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] < target)
                start = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
            else return arr[mid];
        }
        return arr[start];
    }

    public static int floorNum(int[] arr, int target) {
        /*
        Floor means find the greatest number in given array, but it must be smaller than or equal to target.
         */
        if (target < arr[0]) {
            return -1;
        }
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] < target)
                start = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
            else return arr[mid];
        }
        return arr[end];
    }

}