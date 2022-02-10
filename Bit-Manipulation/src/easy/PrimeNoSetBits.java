package easy;

// Problem 11: https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
public class PrimeNoSetBits {
    // Not so good

    // Self-explanatory
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int bits = getBits(i);
            if (isPrime(bits)) count++;
        }
        return count;
    }

    private int getBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) count++;
            n >>= 1;
        }
        return count;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}