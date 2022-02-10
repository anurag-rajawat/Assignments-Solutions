package sorting;

/**
 * Time Complexity: Best Case = O(n^2)
 * <p>Space Complexity: O(1)</p>
 * The Worst Case = O(n^2)
 * <p>The Worst Case means, the array is sorted in descending order</p>
 * It is good for small list (arrays)
 */
public class SelectionSort {
    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int lastIndex = a.length - i - 1;
            int max = maxIndex(a, 0, lastIndex);
            swap(a, max, lastIndex);
        }
    }

    public static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    private static void swap(int[] a, int first, int second) {
        int curr = a[first];
        a[first] = a[second];
        a[second] = curr;
    }
}
