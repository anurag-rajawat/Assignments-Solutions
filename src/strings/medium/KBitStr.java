package strings.medium;

// Problem 17: https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
public class KBitStr {

    // Very Bad solution, but due to my current knowledge I've not optimized solution
    public char findKthBit(int n, int k) {
        return nthStr(n, "0").charAt(k - 1);
    }

    // Generating string via recursion
    // Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1
    public String nthStr(int n, String s) {
        // Base case
        if (n == 1)
            return s;
        s = s + "1" + reverse(invert(s));
        return nthStr(n - 1, s);
    }

    private String invert(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                builder.append("1");
            else builder.append("0");
        }
        return builder.toString();
    }

    private String reverse(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            builder.append(s.charAt(i));
        return builder.toString();
    }
}
