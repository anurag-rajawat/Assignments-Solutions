package easy;

// Problem 13: https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
public class SumDigits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 0) return 0;
        return (n % 10) + sum(n / 10);
    }

}
