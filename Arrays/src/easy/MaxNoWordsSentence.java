package easy;

// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class MaxNoWordsSentence {
    public static int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (String s : sentences) {
            String[] currStr = s.split(" ");
            ans = Math.max(ans, currStr.length);
        }
        return ans;
    }
}
