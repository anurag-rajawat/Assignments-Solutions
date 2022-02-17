package easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([}}])";
        String b = "()))";
        System.out.println(isValid(s));
        System.out.println(isValid(b));
    }

    public static boolean isValid(String s) {
        // Edge Cases
        if (s.length() % 2 != 0) return false;
        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else if (!stack.isEmpty() && ((c == ')' && stack.peek() == '(') || (c == ']' && stack.peek() == '[') || (c == '}' && stack.peek() == '{')))
                stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}
