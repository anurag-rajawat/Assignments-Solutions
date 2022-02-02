package bitmanipulation.easy;

public class BinNumAltBits {
    // Convert n to binary form then check two adjacent bits are equal or not.
    public boolean hasAlternatingBits(int n) {
        String num = Integer.toBinaryString(n);
        for(int i = 0; i < num.length() - 1; i++){
            if (num.charAt(i) == num.charAt(i+1)) return false;
        }

        return true;
    }
}
