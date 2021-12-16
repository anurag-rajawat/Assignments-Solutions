package solutions.arrays.easy;

// Problem 6: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class KidsCandies {
    //    Approach: Just check if ith kid(kid having candies + extra-candies) has more candies than maximum candies
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

//       Finding the maximum no of candies a kid have.
        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }

        for (int candy : candies) {
            int totalCandies = candy + extraCandies;
            if (totalCandies >= maxCandies) result.add(true);
            else result.add(false);
        }
        return result;
    }
}
