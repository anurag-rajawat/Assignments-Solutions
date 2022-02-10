package easy;

// Problem 25: https://leetcode.com/problems/length-of-last-word/
public class LenLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        if (s.isEmpty())
            return 0;
        int len = 0;
        s = s.stripLeading();
        s = s.stripTrailing();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (!(s.charAt(i) == ' ')) {
                len++;
            } else {
                return len;
            }
        }

        return len;
    }
}
