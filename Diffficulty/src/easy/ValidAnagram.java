package easy;

import java.util.Arrays;

// https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] chars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(tChars);

        for (int i = 0; i < s.length(); i++) {
            if (chars[i] != tChars[i]) return false;
        }
        return true;
    }
}
