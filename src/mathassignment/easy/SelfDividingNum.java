package mathassignment.easy;

import java.util.ArrayList;
import java.util.List;

// Problem 9: https://leetcode.com/problems/self-dividing-numbers/submissions/
public class SelfDividingNum {

    // Pretty forward, no need to explain
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDivisible(i)) result.add(i);
        }
        return result;
    }

    public static boolean isDivisible(int n) {
        if (n == 0) return false;
        int originalNum = n;
        while (n != 0) {
            int lastDigit = n % 10;
            if (lastDigit % 10 == 0) return false;
            if (originalNum % lastDigit != 0) return false;
            n /= 10;
        }
        return true;
    }
}
