package easy;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1; // Left for buy and right for sale
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else left = right;
            right++;
        }

        return maxProfit;
    }
}
