package arrays.easy;


// This is medium level problem of LeetCode, but not medium in reality.
// Search target element in infinite sorted array GeeksForGeeks.
public class SearchInfiniteArr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(searchInfinite(arr, target));
    }

    private static int searchInfinite(int[] arr, int target) {
        // Initially start with window of size 2
        int start = 0;
        int end = 2;

        // Condition for the target to lie in this range
        // If target is not in the chunk of range
        while (target > arr[end]) {
            int newStart = end + 1;
            // Now double the size of our window i.e., increase our searching range
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        // Now simply search in array using binary search
        return search(arr, target, start, end);
    }

    private static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
