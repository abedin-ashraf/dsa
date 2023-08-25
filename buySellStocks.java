public class buySellStocks {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Max Profit: " + buyAndSellStocks(prices));
    }

    public static int buyAndSellStocks(int sellPrices[]) {
        int buyPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (int i = 0; i < sellPrices.length; i++) {
            if (buyPrice < sellPrices[i]) { // Profit
                int profit = sellPrices[i] - buyPrice; // today's Profit
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = sellPrices[i];
            }

        }
        return maxProfit;
    }
}
