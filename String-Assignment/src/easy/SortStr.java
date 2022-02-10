package easy;

// Problem 5: https://leetcode.com/problems/sorting-the-sentence/
public class SortStr {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
    }

    // Use LeetCode Hints:
    // 1: Divide the string into the words as an array of strings
    // 2: Sort the words by removing the last character from each word and sorting according to it
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] strings = new String[words.length];
        for (String word : words) {
            String str = word;
            int index = str.charAt(str.length() - 1) - '0';
            str = str.substring(0, str.length() - 1);
            strings[index - 1] = str;
        }
        return String.join(" ", strings);
    }
}
