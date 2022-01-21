package recursion.easy;

// Problem 5:https://leetcode.com/problems/reverse-string/
public class RevString {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    private void reverse(char[] s, int start, int end) {
        // Base case
        if (start >= end / 2) return;

        // Just swap the characters
        char ch = s[start];
        s[start] = s[s.length - start - 1];
        s[s.length - start - 1] = ch;
        reverse(s, start + 1, end);
    }
}