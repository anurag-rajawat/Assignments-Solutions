package easy;

// Problem 22: https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
public class SortedOrNot {
    public static void main(String[] args) {
        int[] a = {20, 21, 45, 88, 89, 90};
        int[] b = {20, 78, 91, 99, 97};
        int[] c = {};
        int[] d = {1};
        System.out.println(arraySortedOrNot(a, 0));
        System.out.println(arraySortedOrNot(b, 0));
        System.out.println(arraySortedOrNot(c, 0));
        System.out.println(arraySortedOrNot(d, 0));
    }

    public static boolean arraySortedOrNot(int[] a, int index) {
        if (a.length == 0)  //Edge Case
            return true;
        if (index == a.length - 1) // Base Case
            return true;
        return a[index] < a[index + 1] && arraySortedOrNot(a, index + 1);
    }
}
