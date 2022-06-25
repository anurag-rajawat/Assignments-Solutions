package easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
public class CellsInExcelSheet {
    public static List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder sb;
        for (char ch1 = s.charAt(0); ch1 <= s.charAt(3); ch1++) {
            for (char ch2 = s.charAt(1); ch2 <= s.charAt(4); ch2++) {
                sb = new StringBuilder();
                sb.append(ch1).append(ch2);
                result.add(sb.toString());
            }
        }
        return result;
    }
}