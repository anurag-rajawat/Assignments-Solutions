package medium;

//Problem 8: https://leetcode.com/problems/powx-n/
public class PowXN {
    public double myPow(double x, int n) {
        double res = pow(x, Math.abs(n));
        if (n >= 0) return res;
        return 1 / res; // If exponent is negative
    }

    public double pow(double x, int n) {
        // Base cases
        if (n == 0) return 1;
        if (x == 0) return 0;
        double res = pow(x, n / 2);
        res *= res;
        if ((n & 1) == 0) return res; // Checking n is even or not
        return x * res; // If exponent is odd
    }
}
