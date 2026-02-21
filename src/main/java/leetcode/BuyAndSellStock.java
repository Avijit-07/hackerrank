package leetcode;

public class BuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length ; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else
                maxProfit = Math.max(maxProfit, (prices[i] - minPrice));
            }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
