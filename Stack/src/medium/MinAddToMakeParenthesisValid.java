package medium;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
public class MinAddToMakeParenthesisValid {
    public static int minAddToMakeValid(String s) {
        int openParentheses = 0;
        int ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') openParentheses++;
            else {
                if (openParentheses == 0) ans++;
                else openParentheses--;
            }
        }

        return ans + openParentheses;
    }
}
