package easy;

import java.util.List;

// Problem 4: https://leetcode.com/problems/count-items-matching-a-rule/
public class CountItems {
    // Using LeetCode hint
    // Iterate on each item, and check if each one matches the rule according to the statement.
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;
        for (List<String> item : items) {
            switch (ruleKey) {
                case "type" -> {
                    if (item.get(0).equals(ruleValue)) {
                        matches++;
                    }
                }
                case "color" -> {
                    if (item.get(1).equals(ruleValue)) {
                        matches++;
                    }
                }
                case "name" -> {
                    if (item.get(2).equals(ruleValue)) matches++;
                }
            }
        }
        return matches;
    }
}
