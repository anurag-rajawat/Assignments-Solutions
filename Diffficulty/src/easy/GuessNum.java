package easy;

// https://leetcode.com/problems/guess-number-higher-or-lower/submissions/
public class GuessNum {
    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if num is lower than the guess number
     * 1 if num is higher than the guess number
     * otherwise return 0
     * int guess(int num);
     */

    public int guessNumber(int n) {
        int start = 1, end = n;
        // Uncomment the following to submit
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//            if(guess(mid) == 0) return mid;
////            else if(guess(mid) == -1) end = mid - 1;
//            else start = mid + 1;
//        }
        return -1;
    }
}