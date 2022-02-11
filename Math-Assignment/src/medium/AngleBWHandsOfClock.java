package medium;

// Problem 6: https://leetcode.com/problems/angle-between-hands-of-a-clock/
public class AngleBWHandsOfClock {
    /**
     * Mathwise-
     * <p>1 hour = 60 minutes = 360 degrees on a clock.
     * <p>every time minute hand travels 360 degrees, hour hand travels by 1 hour's worth - 30 degrees (360/12)</p>
     * <p>every time minute hand travels 6 degrees (1 minute), hour hand travels (30*6)/360: 0.5 degrees</p>
     * <p>
     * minute hand would be at the 6*minute angle
     * hour hand would be at the 30*hour + 0.5*minute.
     * <p>
     * compute the angle difference
     * if angle is bigger than 180, return the 360 - angle result
     * minute hand goes 6 degrees per minute
     * <p>
     * angle will be minute angle - hour angle (abs);
     */

    public double angleClock(int hour, int minutes) {
        double ans = 0;
        double minAngle = 6 * minutes;
        double hourAngle = 30 * hour + 0.5 * minutes;
        ans = Math.abs(minAngle - hourAngle);
        return Math.min(ans, 360 - ans); //as thought earlier, we could use a conditional like if(angle > 180) {return 360-angle};
    }
}