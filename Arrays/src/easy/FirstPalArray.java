package easy;

// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
public class FirstPalArray {
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPal(word)) return word;
        }
        return "";
    }

    private static boolean isPal(String word) {
        int i = 0, j = word.length() - 1;
        while (i <= j) {
            if (word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
