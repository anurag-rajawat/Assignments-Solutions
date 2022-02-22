package easy;

// https://leetcode.com/problems/valid-perfect-square/
public class ValidPerfSq {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        long start = 1, end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sq = mid * mid;
            if (sq == num) return true;
            else if (sq < num) start = (mid + 1);
            else end = (mid - 1);
        }
        return false;
    }
}
