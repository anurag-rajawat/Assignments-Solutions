package strings.easy;

// Problem 21: https://leetcode.com/problems/merge-strings-alternately/
public class MergeString {
    // Merging two strings like merge sort but instead of sorting add alternative character
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            builder.append(word1.charAt(i));
            builder.append(word2.charAt(j));
            i++;
            j++;
        }
        while (i < word1.length()) {
            builder.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            builder.append(word2.charAt(j));
            j++;
        }
        return builder.toString();
    }
}
