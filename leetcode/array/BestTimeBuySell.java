package leetcode.array;
public class BestTimeBuySell {
    public static void main(String[] args) {
        
    }
    //1ms, 58MB
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int finalProfit = 0;
        int profit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < low) {
                low = prices[i];
            }
            profit = prices[i] - low;

            if(finalProfit < profit) {
                finalProfit = profit;
            }
        }
        return finalProfit;
    }
}
