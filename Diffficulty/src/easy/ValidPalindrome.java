package easy;

// https://www.youtube.com/watch?v=jJXJ16kPFWg&list=PLot-Xpze53lfQmTEztbgdp8ALEoydvnRQ&index=32
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println(isPal("ab@a"));
        System.out.println(isPal("a."));
//        System.out.println(isPalindrome(s));
//        System.out.println(isPalindrome(s2));
//        System.out.println();
//        System.out.println(isPal(s));
//        System.out.println(isPal(s2));
    }

    //Brute force, Occupying O(len(s)) space
    public static boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) return true;
        s = s.strip().toLowerCase().replace(",", "").replace(":", "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
                sb.append(s.charAt(i));
            }
        }
        String s1 = sb.toString();
        if (s1.isEmpty()) return true;
        for (int i = 0; i <= s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - i - 1)) return false;
        }
        return true;
    }

    // Awesome solution with O(1) space
    public static boolean isPal(String s) {
        if (s.isEmpty() || s.length() == 1) return true;

        s = s.strip().toLowerCase();

        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && isAlphaNum(s.charAt(left))) left++;
            while (right > left && isAlphaNum(s.charAt(right))) right--;
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    public static boolean isAlphaNum(char ch) {
        return (ch < '0' || ch > '9') && (ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z');
    }
}
