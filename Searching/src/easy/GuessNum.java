package easy;

// Problem 2 - https://leetcode.com/problems/guess-number-higher-or-lower/
public class GuessNum {
    /**
     * Forward declaration of guess API.
     *
     * @param n your guess
     * @return -1 if num is lower than the guess number
     * 1 if num is higher than the guess number
     * otherwise return 0
     * int guess(int num);
     */


    public int guessNumber(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            // Below line is giving error because it's asking for "guess" method, but we don't need
            // to implement it, its internal implementation of LeetCode, that's why we need not worry about it.
            int isCorrect = guess(mid);
            if (isCorrect == -1) {
                end = mid - 1;
            } else if (isCorrect == 1) {
                start = mid + 1;
            } else if (isCorrect == 0) {
                return mid;
            }
        }
//      At this point, after all the guesses the number must be start
        return start;
    }

    // This implementation is just to fix error it's not right implementation of "guess" API provided by LeetCode
    // You shouldn't use it also no need to implement(fix) it.
    public int guess(int x) {
        return x;
    }
}
