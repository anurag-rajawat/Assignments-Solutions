package easy;

// Problem 7 - https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class NextGreatestLetter {

    // In this we have to ceil the value nothing else, which needs to be extracted from problem
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] < target) {
                start = mid + 1;
            } else if (letters[mid] > target) {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }

}
