package easy;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToSellBuy1 {
    // Using two pointers
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            } else left = right;
            right++;
        }
        return maxProfit;
    }
}
