package sorting.easy;

import java.util.Arrays;

public class HeightChecker {
    // Just check the number of indices where heights[i] != expected[i].
    // which is stated in question
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] expected = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);

        for (int i = 0; i < expected.length; i++) {
            if (heights[i] != expected[i]) count++;
        }
        return count;
    }
}
