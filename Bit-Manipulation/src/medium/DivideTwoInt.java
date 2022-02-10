package medium;

// Problem 4: https://leetcode.com/problems/divide-two-integers/
public class DivideTwoInt {
    public static void main(String[] args) {
        System.out.println(1<<1<<1<<1);
        System.out.println(divide(10, 3));
        System.out.println(divide(-1, -1));
        System.out.println(divide(-2147483648 , -1));
    }

    public static int divide(int dividend, int divisor) {
        // This condition is stated in question
        if(dividend == 1<<31 && divisor == -1) return Integer.MAX_VALUE;

        // Checking the sign
        // If both signs are same then it's positive otherwise negative
        boolean sign = (dividend >= 0) == (divisor >= 0);

        // We've to use positive values
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        while(dividend - divisor >= 0){
            int count = 0;
            while(dividend - (divisor << 1 << count) >= 0){
                count++;
            }
            quotient += 1 << count;
            dividend -= divisor << count;
        }
        return sign ? quotient : -quotient;
    }
}
