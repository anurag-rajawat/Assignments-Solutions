package easy;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class BestTimeToSellBuy2 {

    // Pretty straightforward
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) maxProfit += (prices[i] - prices[i - 1]);
        }

        return maxProfit;
    }
}
