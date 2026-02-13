//Problem Statement-- You are given an array prices where prices[i] is the price of a given stock on the ith day. 
//(Leetcode-121)      You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

public class buyAndSellStock {
    public static int maxProfit(int[] prices) {

        //initially maximum profit is 0
        int maxProfit = 0;
        int x = prices[0];

        //traversing through the array prices
        for (int i = 0; i < prices.length; i++) {
            if (x > prices[i]) {
                x = prices[i];
            }

            else {
                int profit = prices[i] - x;
                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));

    }
}