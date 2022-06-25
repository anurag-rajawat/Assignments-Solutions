package easy;

// https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/submissions/
public class GenerateString {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if ((n & 1) == 0){
            sb.append("a".repeat(Math.max(0, n - 1)));
            sb.append('b');
        }
        else {
            sb.append("a".repeat(Math.max(0, n)));
        }
        return sb.toString();
    }
}
