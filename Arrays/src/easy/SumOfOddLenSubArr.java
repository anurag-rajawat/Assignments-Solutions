package easy;

// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
public class SumOfOddLenSubArr {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr));
        /*
        1, 4, 2, 5, 3 = 15
        1 + 4 + 2 = 7
        4 + 2 + 5 = 11
        2 + 5 + 3 = 10
        1 + 4 + 2 + 5 + 3 = 15
         */
    }
    // Brute-force, TC = O(n^2)
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (isOdd(i + j + 1)) {
                    sum += indexSum(arr, i, j);
                }
            }
        }
        return sum;
    }

    private static int indexSum(int[] arr, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += arr[k];
        }
        return sum;
    }

    private static boolean isOdd(int len) {
        return (len & 1) != 0;
    }
}
