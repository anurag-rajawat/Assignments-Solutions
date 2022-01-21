package Algorithms.sorting;

/**
 * Time Complexity: O(n)
 * Space Complexity: (1)
 * <p>Whenever we have given numbers from 1 to n : N belongs to natural numbers
 * also the numbers are continuous then we have to apply Cyclic Sort.</p>
 * <p>
 * If the range = [0, n]: Every element will be at index=value (In line correctIndex).
 * </p>  <p>
 * If the range = [1, n]: Every element will be at index=value-1 (In line correctIndex)
 * </p>
 */
public class CycleSort {
    // If range is [1, n]
    public static void sort(int[] a) {
        for (int i = 0; i < a.length; ) {
            int correct = a[i] - 1;
            if (a[i] != a[correct]) {
                swap(a, i, correct);
            } else {
                i++;
            }
        }
    }

    // If range is [0, n]
    public static void sort2(int[] a) {
        for (int i = 0; i < a.length; ) {
            int correct = a[i];
            if (a[i] != a[correct]) {
                swap(a, i, correct);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] a, int first, int second) {
        int curr = a[first];
        a[first] = a[second];
        a[second] = curr;
    }
}
