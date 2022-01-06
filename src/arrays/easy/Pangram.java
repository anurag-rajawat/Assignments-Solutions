package arrays.easy;

// Problem 10 - https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class Pangram {
    public boolean checkIfPangram(String sentence) {
//        For marking present or absent, since there are only 26 letters in english alphabet
        boolean[] isPresent = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            int idx = sentence.charAt(i) - 'a';
            isPresent[idx] = true;
        }

        for (boolean ele : isPresent) {
            if (!ele) return false;
        }
        return true;
    }
}
