package in.pelligent.leetcode.programming.besttimetobuystocks;

public class BestTimeToBuyStocks {
    public int solution1(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int currentGain = 0;

        for(int price : prices) {
            if(price < min) {
                min = price;
            }

            currentGain = price - min;
            if(maxProfit < currentGain) {
                maxProfit = currentGain;
            }
        }

        return maxProfit;
    }
}
