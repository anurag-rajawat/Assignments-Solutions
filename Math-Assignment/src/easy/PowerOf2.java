package easy;

// Problem 11: https://leetcode.com/problems/power-of-two/
// Same problem of recursion
public class PowerOf2 {
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }
}
