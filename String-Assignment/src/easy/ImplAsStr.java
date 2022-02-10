package easy;

public class ImplAsStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        else if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
