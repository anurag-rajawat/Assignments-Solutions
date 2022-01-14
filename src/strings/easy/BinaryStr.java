package strings.easy;

public class BinaryStr {
    public boolean checkOnesSegment(String s) {
        int x = s.indexOf('1');
        int y = s.lastIndexOf('1');
        for (int i = x + 1; i < y; i++) {
            if (s.charAt(i) != '1') return false;
        }
        return true;
    }
}
