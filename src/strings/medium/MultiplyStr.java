package strings.medium;

import java.math.BigInteger;

public class MultiplyStr {

    public String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger product = n1.multiply(n2);
        return product.toString();
    }
}
