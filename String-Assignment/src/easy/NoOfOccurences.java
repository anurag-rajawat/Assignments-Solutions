package easy;

import java.util.HashMap;

// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
public class NoOfOccurences {
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char ch : s.toCharArray())
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);

        int val = frequency.get(s.charAt(0));

        for (char ch : s.toCharArray()) {
            if (frequency.get(ch) != val) return false;
        }
        return true;
    }
}
