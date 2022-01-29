package algorithms.sorting;

/**
 * Time Complexity: O( n<sup>2</sup> ) on all dataset, and it provides in-place sorting
 * <p>Space complexity: O(1)</p>
 */


public class BubbleSort {
    /**
     * Here we are running n-1 steps, for each step, max item will come at the last respective index
     * and swap element if the element is smaller than the previous one.
     */
    public static void sort(int[] a) {
        boolean isSwapped;
        for (int i = 0; i < a.length; i++) {
            isSwapped = false;
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }

    private static void swap(int[] a, int first, int second) {
        int curr = a[first];
        a[first] = a[second];
        a[second] = curr;
    }
}

