package easy;

// https://leetcode.com/problems/count-prefixes-of-a-given-string/
public class CountPrefixString {
    // Same as CountWordPrefix
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String word : words) {
            if (containPrefix(s, word)) count++;
        }
        return count;
    }

    private boolean containPrefix(String prefix, String word) {
        int wordLen = prefix.length();
        int prefLen = word.length();
        if (wordLen < prefLen) return false;
        for (int i = 0; i < prefLen; i++) {
            if (prefix.charAt(i) != word.charAt(i)) return false;
        }
        return true;
    }
}