package easy;

// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        s = s.strip().toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && isAlphaNum(s.charAt(left))) left++;
            while (left < right && isAlphaNum(s.charAt(right))) right--;
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean isAlphaNum(char ch) {
        return (ch < 48 || ch > 57) && (ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z');
    }
}
