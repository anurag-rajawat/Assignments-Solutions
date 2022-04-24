package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// https://leetcode.com/problems/intersection-of-multiple-arrays/
public class IntersectionOfMultipleArrays {
    public List<Integer> intersection(int[][] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums[0]) set.add(n);

        for (int i = 1; i < nums.length; i++) {
            HashSet<Integer> set1 = new HashSet<>();
            for (int n : nums[i]) set1.add(n);
            set.retainAll(set1);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
