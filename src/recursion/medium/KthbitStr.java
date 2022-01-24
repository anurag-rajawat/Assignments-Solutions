package recursion.medium;

// Problem 4: https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
// This is same of string assignment problem
public class KthbitStr {
    public char findKthBit(int n, int k) {
        return nthStr(n, "0").charAt(k - 1);
    }

    public String nthStr(int n, String s) {
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
