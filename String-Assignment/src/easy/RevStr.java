package easy;

// Problem 12: https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class RevStr {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    // Using Built-in Fn
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuffer(word).reverse().toString()).append(" ");
        }
        return sb.toString().trim();
    }
}
