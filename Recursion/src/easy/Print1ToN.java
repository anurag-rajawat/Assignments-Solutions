package easy;

// Problem 6: https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/
public class Print1ToN {
    public static void main(String[] args) {
        oneToN(100);
    }

    private static void oneToN(int n) {
        // Base Case
        if (n < 1) return;
        oneToN(n - 1);
        System.out.println(n);
    }
}
