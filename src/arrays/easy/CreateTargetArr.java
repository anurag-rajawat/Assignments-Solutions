package arrays.easy;

// Problem 9 - https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.ArrayList;

public class CreateTargetArr {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> temp = new ArrayList<>();

//      Adding the elements, according to the specified index.
        for (int i = 0; i < nums.length; i++) {
            temp.add(index[i], nums[i]);
        }

        int[] target = new int[temp.size()];

        // Copying elements from arraylist to our answer array
        for (int i = 0; i < target.length; i++) {
            target[i] = temp.get(i);
        }
        return target;
    }

}

