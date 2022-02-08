package bitmanipulation.easy;

// Problem 1: https://leetcode.com/problems/add-binary/
public class AddBinary {
    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        // We are adding numbers from most significant digit to the least significant digit
        // that's why we have to iterate from backwards of both strings
        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i) - '0'; // to ensure that we're not adding same character again if that string is completed
            if (j >= 0) sum += b.charAt(j) - '0';

            sb.append(sum % 2); // In binary there are only 2 digits so, we need to take modulo
            carry = sum / 2;

            i--;
            j--;
        }

        if (carry != 0) sb.append(carry);

        return sb.reverse().toString();
    }
}
