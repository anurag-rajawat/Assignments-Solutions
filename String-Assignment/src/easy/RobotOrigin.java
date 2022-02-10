package easy;

// Problem 11: https://leetcode.com/problems/robot-return-to-origin/
public class RobotOrigin {
    public boolean judgeCircle(String moves) {
        int up, down, right, left;
        up = down = right = left = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                left--;
            } else if (moves.charAt(i) == 'R') {
                right++;
            } else if (moves.charAt(i) == 'D') {
                down--;
            } else if (moves.charAt(i) == 'U') {
                up++;
            }
        }
        return (up + down == 0) && (left + right) == 0;
    }
}
