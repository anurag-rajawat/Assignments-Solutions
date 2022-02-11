package medium;

import java.util.ArrayList;
import java.util.List;

// Problem 8: https://leetcode.com/problems/the-kth-factor-of-n/submissions/
public class KthFactorOfN {
    public int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        if (list.size() < k) return -1;
        return list.get(k - 1);
    }
}
