package medium;

import java.math.BigInteger;

// Problem 11: https://leetcode.com/problems/multiply-strings/
// We've to use biginteger otherwise there are overflow error, also separately import biginteger class in the LeetCode solution
public class MultiplyString {
    public String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        BigInteger product = n1.multiply(n2);
        return String.valueOf(product);
    }
}
