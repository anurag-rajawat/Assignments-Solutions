package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/two-out-of-three/
public class TwoOutOfThree {
    // Good, but not so good
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    Set<Integer> set3 = new HashSet<>();
    Set<Integer> set = new HashSet<>();

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();

        for (int n1 : nums1) set1.add(n1);
        for (int n2 : nums2) set2.add(n2);
        for (int n3 : nums3) set3.add(n3);

        set.addAll(set1);
        set.addAll(set2);
        set.addAll(set3);

        for (int num : set)
            if (contains(num)) result.add(num);

        return result;
    }

    private boolean contains(int num) {
        if (set1.contains(num) && set2.contains(num)) return true;
        else if (set2.contains(num) && set3.contains(num)) return true;
        else return set3.contains(num) && set1.contains(num);
    }
}
