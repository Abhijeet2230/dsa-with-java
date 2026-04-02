package array;

/**
 * Problem: Best Time to Buy and Sell Stock
 * Given an array 'prices' where prices[i] is the price of a given stock on the i-th day.
 * We want to maximize our profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        // Example price array
        int[] price = {7,1,5,3,6,4};
        // Print the maximum profit possible
        System.out.println(maxProfit(price));
    }

    public static int maxProfit(int[] prices) {
        // Initialize minPrice to the first element and maxProfit to 0
        int minPrice = prices[0];
        int maxProfit = 0;

        // Iterate through the price array starting from the first day
        for(int i=0;i<prices.length;i++){
            // If the current price is lower than our minimum price so far, update minPrice
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else{
                // Calculate the profit if we sell at the current price
                int profit = prices[i]-minPrice;
                // Update maxProfit if the current profit is greater than the previous maxProfit
                maxProfit = Math.max(maxProfit,profit);
            }
        }

        // Return the overall maximum profit found
        return maxProfit;
    }
}
