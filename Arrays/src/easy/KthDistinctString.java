package easy;

import java.util.HashMap;

// https://leetcode.com/problems/kth-distinct-string-in-an-array/
public class KthDistinctString {
    // Discussion, not so good
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.replace(s, map.get(s) + 1);
            } else map.put(s, 1);
        }

        int count = 0;
        for (String s : arr) {
            if (map.get(s) == 1) count++;
            if (count == k) return s;
        }

        return "";
    }
}
