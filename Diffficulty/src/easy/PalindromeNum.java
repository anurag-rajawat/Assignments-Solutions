package easy;

// https://leetcode.com/problems/palindrome-number/description/
public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int n) {
        if (n == -1) return false;
        return n == rev(n);
    }

    static int rev(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) return n;
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
