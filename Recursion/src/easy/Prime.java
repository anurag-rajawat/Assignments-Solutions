package easy;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(7,2));
    }
    public static boolean isPrime(int n, int start) {
        if (start == n) return true;
        if (n <= 2) return n == 2;
        if (n % start == 0) return false;
        return isPrime(n, start + 1);
    }
}
