package easy;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public boolean isValid(String s) {
        // Base case
        if ((s.length() & 1) != 0 || s.isEmpty()) return false;

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else return false;
            } else if (ch == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') stack.pop();
                else return false;
            } else if (ch == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
