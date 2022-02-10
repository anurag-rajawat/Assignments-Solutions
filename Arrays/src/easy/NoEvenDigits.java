package easy;

//  Problem 16: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/-
public class NoEvenDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEven(num)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(noOfDigits(1));
    }

    //    Determines whether a number is even or not, I've done it using bit manipulation.
    private boolean isEven(int num) {
        int digits = noOfDigits(num);
        return ((digits & 1) == 0);
    }

    //    Just mathematical magic to calculate digits of a number.
    public static int noOfDigits(int n) {
        // Edge case
        if (n == 0) return 1;
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
