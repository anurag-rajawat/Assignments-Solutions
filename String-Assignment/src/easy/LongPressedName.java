package easy;

// Problem 15: https://leetcode.com/problems/long-pressed-name/
public class LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        // Best Case
        if (name.equals(typed)) return true;
        // Base case
        if (name.length() > typed.length()) return false;
        int count = 0;
        int i = 0;
        // Checking individual character of name and typed
        for (int j = 0; j < typed.length(); j++) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                count++;
            } else if (j == 0 || typed.charAt(j - 1) != typed.charAt(j)) {
                return false;
            }

        }
        return count == name.length();
    }
}
