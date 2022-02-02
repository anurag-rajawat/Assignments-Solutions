package bitmanipulation.easy;

// Problem 8: https://leetcode.com/problems/number-complement/
public class NoComplement {
    // Steps: 1 - find the binary form of number
    // 2: Replace 1's with 0's and vice-versa in the binary form of number
    // 3: Convert binary number to decimal number
    public static int findComplement(int num) {
        String n = Integer.toBinaryString(num);
        String revNum = reverse(n);
        return Integer.parseInt(revNum, 2);
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') sb.append('1');
            else sb.append('0');
        }
        return sb.toString();
    }
}
