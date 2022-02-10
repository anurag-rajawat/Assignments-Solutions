package medium;

import java.util.HashMap;

// Problem 3: https://leetcode.com/problems/single-number-ii/
public class SingleNum2 {
    public static void main(String[] args) {
        int[] a = {30000, 500, 100, 30000, 100, 30000, 100};
        System.out.println(singleNumber(a));
    }

    // Using HashMap
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) return key;
        }
        return -1;
    }
}
