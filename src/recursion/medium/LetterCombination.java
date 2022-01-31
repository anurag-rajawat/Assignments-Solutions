package recursion.medium;

import java.util.ArrayList;
import java.util.List;

// Problem 17: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombination {
    public static void main(String[] args) {
        String digits = "8";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        // Edge Case
        if (digits.isEmpty()) return new ArrayList<>();
        return getCombination("", digits);
    }

    // I'm solving it using processed and unprocessed approach as taught by Kunal Kushwaha aka GuruJi
    // Also, this is not so good solution but because of my limited knowledge I've to do it like this.
    // But after learning more advanced topics, I'll try to optimize it.
    public static List<String> getCombination(String processed, String unProcessed) {
        // Base Case
        if (unProcessed.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> ans = new ArrayList<>();

        // Get the digit and cast to integer from unprocessed string
        int digit = unProcessed.charAt(0) - '0';

        // There will be 3 cases because there are different no of letters in different digits
        // So, we've to be careful about them
        // e.g. Digit 7 and 9 contains 4 letters "p, q, r, s" and "w, x, y, z" respectively
        // whereas 1 does not contain any letters and remaining ones contains 3 letters each.

        // Case 1: Digit having 4 letters
        if (unProcessed.startsWith("7")) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(getCombination(processed + ch, unProcessed.substring(1)));
            }
        }
        // We've to more careful about digit 9 that's why I treated it as a separate case
        else if (unProcessed.startsWith("9")) {
            for (int i = ((digit - 2) * 3) + 1; i <= ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(getCombination(processed + ch, unProcessed.substring(1)));
            }
        }

        // Case 2: Digit having 3 letters
        else if (unProcessed.startsWith("8")) {
            for (int i = ((digit - 2) * 3) + 1; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(getCombination(processed + ch, unProcessed.substring(1)));
            }
        }

        // Case 3: For digit 1
        else {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(getCombination(processed + ch, unProcessed.substring(1)));
            }
        }
        return ans;
    }
}