package easy;

// https://leetcode.com/problems/ugly-number/submissions/
public class UglyNum {
    public boolean isUgly(int n) {
        // Edge cases, stated in question
        if(n <= 0) return false;
        if(n == 1) return true;

        int[] primeFactors = {2, 3, 5};
        for(int  i = 0; i < 3; i++){
            while(n % primeFactors[i] == 0) n /= primeFactors[i];
        }
        return n == 1;
    }
}
