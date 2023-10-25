public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] test = new int[] { 7, 1, 5, 3, 6, 4 };
    }

    public static int maxProfit(int[] prices) {
        int firstDay = prices[0];
        int profit = 0;
        int maxProfit = 0;
        for (int index = 1; index < prices.length; index++) {
            if (firstDay < prices[index]) {
                profit = prices[index] - firstDay;
            } else {
                firstDay = prices[index];
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
