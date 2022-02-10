package easy;

import java.util.Arrays;

// Problem 13 - https://leetcode.com/problems/flipping-an-image/
public class FlippingImage {
    public static void main(String[] args) {
        int[][] img = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(img)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                ans[i][j] = image[i][image.length - j - 1];
                if (ans[i][j] == 1)
                    ans[i][j] = 0;
                else
                    ans[i][j] = 1;
            }
        }
        return ans;
    }
}
