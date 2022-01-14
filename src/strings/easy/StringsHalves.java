package strings.easy;

// Problem 8: https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class StringsHalves {
    // Brute-force
    public boolean halvesAreAlike1(String s) {
        s = s.toLowerCase();
        int len = s.length();
        int half = len / 2;
        int vowel1 = 0;
        int vowel2 = 0;

        for (int i = 0; i < half; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowel1++;
            }
        }
        for (int i = half; i < len; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowel2++;
            }
        }
        return vowel1 == vowel2;
    }

    // Second Approach;
    public boolean halvesAreAlike2(String s) {
        s = s.toLowerCase();
        int len = s.length();
        int half = len / 2;
        String s1 = s.substring(0, half);
        String s2 = s.substring(half, len);
        int vowel1 = countVowels2(s1);
        int vowel2 = countVowels2(s2);
        return vowel1 == vowel2;
    }

    private int countVowels2(String s) {
        int vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowels++;
            }
        }
        return vowels;
    }

    // Third Approach;
    public boolean halvesAreAlike3(String s) {
        s = s.toLowerCase();
        int len = s.length();
        int half = len / 2;
        String s1 = s.substring(0, half);
        String s2 = s.substring(half, len);
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int vowel1 = countVowels(c1);
        int vowel2 = countVowels(c2);
        return vowel1 == vowel2;
    }

    private int countVowels(char[] chars) {
        int vowels = 0;
        for (char ch : chars) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        return vowels;
    }
}
