package easy;

// Problem 9: https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
public class StrLen {
    public static void main(String[] args) {
        String s = "  ";
        System.out.println(len(s));
    }

    private static int len(String str) {
        str = str.trim(); // If string contains whitespaces
        if (str.isEmpty()) return 0;
        return len(str.substring(1)) + 1;
    }

}
