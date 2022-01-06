package searching.easy;

// Problem 5 - https://leetcode.com/problems/valid-perfect-square/
public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(2));
        System.out.println(isPerfectSquare(3));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));
    }

    // Just use the approach of finding square root of a number using binary search
    public static boolean isPerfectSquare(int num) {
        // Edge Case
        if (num == 1) return true;

        long start = 1, end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == num) return true;
            else if (mid * mid < num) start = mid + 1;
            else end = mid - 1;
        }

        // At this point, num is not a perfect square
        return false;
    }
}
