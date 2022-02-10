package easy;

// Problem 4: https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstUpperCase {
    public static void main(String[] args) {
        System.out.println(firstUpperLetter("geeksforgeeKs"));
        System.out.println(firstUpperLetter("Anurag"));
        System.out.println(firstUpperLetter("anurag"));
    }

    public static char firstUpperLetter(String s) {
        if (s.isEmpty()) return ' ';
        if (s.charAt(0) == '\0') return ' ';
        if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
            return s.charAt(0);
        }
        return firstUpperLetter(s.substring(1));
    }
}
