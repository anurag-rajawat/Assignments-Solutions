package easy;

import java.util.ArrayList;
import java.util.List;

public class TargetIndices {
    /*
    LeetCode discussion:
    Third idea(best one according to me) just traverse through the array and count number of elements less than target and also the number of elements equals to target.
    Now use a to fill the arraylist with required index. The idea is that the target element's index will exist only after smaller elements.
     */

    //    TC = O(n), SC = O(1)
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int lessThanTarget = 0, equalToTarget = 0;
        for (int num : nums) {
            if (num < target) lessThanTarget++;
            else if (num == target) equalToTarget++;
        }
        for (int i = 0; i < equalToTarget; i++) {
            list.add(lessThanTarget++);
        }
        return list;
    }
}

