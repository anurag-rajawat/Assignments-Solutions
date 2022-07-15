package easy;

import java.util.Stack;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class AllAdjacentDuplicateString {
    public static void main(String[] args) {
        String s = "abbaca", t = "azxxzy";
        System.out.println(removeDuplicates(s));
        System.out.println(removeDuplicates(t));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != ch) stack.push(ch);
            else if (stack.peek() == ch) {
                while (!stack.isEmpty() && stack.peek() == ch) stack.pop();
            }
        }
        while (!stack.isEmpty()) builder.append(stack.pop());
        return builder.reverse().toString();
    }
}
