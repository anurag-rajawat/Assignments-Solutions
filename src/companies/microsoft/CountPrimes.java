package companies.microsoft;

// https://leetcode.com/problems/count-primes/
public class CountPrimes {

    public static void main(String[] args) {
        System.out.println(sieve(3));
    }
    public static int sieve(int n) {
        /*
        In this array, if it is marked false at ith index, it means ith index is prime number, and all the multiple of these prime numbers are marked true.
         */

        if (n<=2) return 0;
        boolean[] primes = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {
            // If the ith index is false, then mark its multiple true.
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        int ans = 0;
        for (int i = 2; i < n; i++) {
            if (!primes[i]) ans++;
        }
        return ans;
    }

}
