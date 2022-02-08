package bitmanipulation.easy;

// Problem 15:
public class XorArr {
    public int xorOperation(int n, int start) {
        int ans = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = start + 2 * i;
        for (int num : arr) ans ^= num;
        return ans;
    }
}
