public class arrayQ3 {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));

        int prices2[] = { 7, 6, 4, 3, 1 };
        System.out.println(buyAndSellStocks(prices2));
    }

    public static int buyAndSellStocks(int sellPrices[]) {
        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = sellPrices[0];

        for (int i = 1; i < sellPrices.length; i++) {
            if (buyPrice < sellPrices[i]) {
                int profit = sellPrices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = sellPrices[i];
            }
        }
        if (maxProfit < 0) {
            return 0;
        }
        return maxProfit;
    }
}
