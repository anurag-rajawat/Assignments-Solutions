package easy;

// https://leetcode.com/problems/length-of-last-word/
public class LenOfLastWord {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        s = s.strip();
        int len = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            if (!(s.charAt(i) == ' ')) len++;
            else return len;
            i--;
        }
        return len;
    }
}
