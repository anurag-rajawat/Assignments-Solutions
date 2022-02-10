package easy;

// Problem 16: https://leetcode.com/problems/valid-palindrome/
public class ValidPal {
    public boolean isPalindrome(String s) {
        // Base Case
        if (s.isEmpty() || s.length() == 1)
            return true;

        s = s.strip().toLowerCase();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
                builder.append(s.charAt(i));
            }
        }

        String s1 = builder.toString();
        if (s1.isEmpty())
            return true;
        for (int i = 0; i <= s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - i - 1))
                return false;
        }
        return true;
    }
}
