package mathassignment.easy;

// Problem 4: https://leetcode.com/problems/power-of-four/
public class PowerOf4 {
    public static boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return isPowerOfFour(n / 2);
    }
}
