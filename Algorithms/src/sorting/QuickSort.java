package sorting;

public class QuickSort {
    /**
     * Sorts the specified array into ascending numerical order.
     * <p>This is not stable sorting algorithm, but an in-place algorithm.
     * It is preferred over merge sort, when we're working on arrays.</p>
     *
     * @param a    the array to be sorted.
     * @param low  it is for explaining the part of array working on.
     * @param high This one is also for explaining the part of array working on.
     * @implNote This sorting algorithm is a Single-Pivot Quicksort
     * <p>Time Complexity: Best Case - O(n log n), The Worst Case - O(n<sup>2</sup>)</p>
     * <p>Space Complexity: O(1)</p>
     */
    public static void quickSort(int[] a, int low, int high) {
        // Base Condition
        if (low >= high) return;

        int start = low, end = high; // These are just for swapping the elements.
        int mid = start + ((end - start) / 2);
        int pivot = a[mid];

        while (start <= end) {
            while (a[start] < pivot) start++;
            while (a[end] > pivot) end--;
            if (start <= end) {
                // Swapping the start and end elements.
                int x = a[start];
                a[start] = a[end];
                a[end] = x;
                start++;
                end--;
            }
        }
        quickSort(a, low, end);
        quickSort(a, start, high);
    }
}
