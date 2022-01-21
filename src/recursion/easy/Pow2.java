package recursion.easy;

// Problem 17: https://leetcode.com/problems/power-of-two/
public class Pow2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(100));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }
}
