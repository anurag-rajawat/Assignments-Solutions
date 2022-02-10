package sorting;

import java.util.Arrays;

/**
 * Time Complexity: Best case - Ω(n log (n))
 * <p>Worst case - O(n<sup>2</sup>)</p>
 * <p>Average case - 𝚹(n log (n)<sup>2</sup>) </p>
 * <p>Space complexity: O(1)</p>
 * <p>It's an in-place comparison sort. It is mainly a variation of sort by exchange (bubble sort) or sort by insertion (insertion sort)</p>
 * <p>This avoids large shifts as in case of insertion sort, if the smaller value is to the far right and has to be moved
 * to be moved to the far left.</p>
 * <p>The idea of Shell Sort is to allow exchange of far (at a particular gap/interval) items fast</p>
 * <p>This spacing is termed as interval of gap</p>
 * <p>Shell Sort is more efficient as compared to Insertion sort or Bubble sort specially when -
 * <p>1. Smaller value elements are towards the end of the array/list</p>
 * <p>2. Large sized array/list</p>
 * <p>3. Efficiency depends on how we select the GAP/ interval</p>
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 1, 2, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 7, 5, 2};
        int[] b = {55, 43, 1, 678};
        int[] c = {1};
        int[] d = {};
        int[] e = {2, 1};
        int[] f = {2, 0, 1, 2};
        int[] g = {-2, 0, -12, -1111111, 343, 142343434, 12343, -22, -14324343, 4343};

        sort(a);
        sort(b);
        sort(c);
        sort(d);
        sort(e);
        sort(f);
        sort(g);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));
        System.out.println(Arrays.toString(g));
    }

    public static void sort(int[] a) {
        // I'm considering gap(interval) = size / 2
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int j = gap; j < a.length; j++) {
                int curr = a[j];
                int i = 0;
                for (i = j; i >= gap && a[i - gap] > curr; i -= gap) {
                    a[i] = a[i - gap];
                }
                a[i] = curr;
            }
        }
    }
}

