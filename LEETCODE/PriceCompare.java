import java.util.Scanner;

public class PriceCompare {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        
        return maxProfit;
    }

} 
  

