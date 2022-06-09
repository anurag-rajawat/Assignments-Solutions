package easy;

// https://leetcode.com/problems/counting-words-with-a-given-prefix/
public class CountWordPrefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (containPrefix(word, pref)) count++;
        }
        return count;
    }

    private boolean containPrefix(String word, String pref) {
        int wordLen = word.length();
        int prefLen = pref.length();
        if (wordLen < prefLen) return false;
        for (int i = 0; i < prefLen; i++) {
            if (word.charAt(i) != pref.charAt(i)) return false;
        }
        return true;
    }
}
