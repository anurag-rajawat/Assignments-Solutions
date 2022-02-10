package easy;

import java.util.ArrayList;
import java.util.List;

// Problem 23 - https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class LuckyNo {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minInRows = new ArrayList<>();
        List<Integer> maxInCols = new ArrayList<>();

//      Finding minimum no in rows
        for (int[] value : matrix) {
            int minNo = Integer.MAX_VALUE;
            for (int i : value) if (i < minNo) minNo = i;
            minInRows.add(minNo);
        }

//      Finding maximum no in columns
        for (int i = 0; i < matrix[0].length; i++) {
            int maxNo = Integer.MIN_VALUE;
            for (int[] ints : matrix) if (ints[i] > maxNo) maxNo = ints[i];
            maxInCols.add(maxNo);
        }

        minInRows.retainAll(maxInCols);
        return minInRows;
    }
}
