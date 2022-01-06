package arrays.easy;

import java.util.List;

public class MatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;
//        Just comparing the ith item with type, color and name
        for (List<String> item : items) {
            switch (ruleKey) {
                case "type":
                    if (item.get(0).equals(ruleValue)) matches++;
                    break;
                case "color":
                    if (item.get(1).equals(ruleValue)) matches++;
                    break;
                case "name":
                    if (item.get(2).equals(ruleValue)) matches++;
                    break;
            }
        }
        return matches;
    }
}
