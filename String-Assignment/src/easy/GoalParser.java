package easy;

// Problem 3: https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParser {
    public String interpret(String command) {
        if (command.length() == 1) return command;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= command.length(); ) {
            if (command.charAt(i - 1) == 'G') {
                sb.append("G");
                i++;
            } else if (command.charAt(i - 1) == '(' && command.charAt(i) == ')') {
                sb.append("o");
                i += 2;
            } else {
                sb.append("al");
                i += 4;
            }
        }
        return sb.toString();
    }
}

