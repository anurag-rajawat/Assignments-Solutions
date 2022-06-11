package easy;

// https://leetcode.com/problems/truncate-sentence/
public class TruncateStr {
    public String truncateSentence(String s, int k) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(strings[i]);
            if (i < k - 1) sb.append(" ");
        }
        return sb.toString();
    }
}
