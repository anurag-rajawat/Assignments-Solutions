package sorting.easy;

import java.util.Arrays;

public class APFromSeq {
    public static void main(String[] args) {
        int[] a = {3, 5, 1};
        System.out.println(canMakeArithmeticProgression(a));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int commonDiff = Math.abs(arr[0] - arr[1]);
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) != commonDiff) return false;
        }
        return true;
    }
}
