package easy;

// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
public class SumOfOddLenSubArr {
    public int sumOddLengthSubarrays(int[] arr) {
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

    private int indexSum(int[] arr, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += arr[k];
        }
        return sum;
    }

    private boolean isOdd(int len) {
        return (len & 1) != 0;
    }
}
