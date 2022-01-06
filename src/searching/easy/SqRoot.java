package searching.easy;

// Problem 1 - https://leetcode.com/problems/sqrtx/
public class SqRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
//      Edge Case
        if (x == 0 || x == 1) return x;
        long start = 0, end = x;
        while (start <= end) {
            long mid = start + ((end - start) / 2);
            if (mid * mid == x) return (int) mid;
            else if (mid * mid < x) start = mid + 1;
            else end = mid - 1;
        }
//      if x is not a perfect square than so, we've to truncate it
        return (int) end;
    }
}
