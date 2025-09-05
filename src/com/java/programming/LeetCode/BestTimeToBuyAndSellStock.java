package com.java.programming.LeetCode;

public class BestTimeToBuyAndSellStock {

//    Input: prices = [7,1,5,3,6,4]
//    Output: 5

    public static void main(String[] args) {

        int[] stockPrice = {7, 1, 5, 3, 6, 4};
        System.out.println(findTheBestTimeToBuyAndMakeProfit(stockPrice));

    }

    static int findTheBestTimeToBuyAndMakeProfit(int[] price) {

        int maxProfit = 0;
        int buyPrice = price[0];
        int currentProfit = 0;

        for (int i = 1; i < price.length; i++) {

            if (price[i] < buyPrice) {
                buyPrice = price[i];
            }

            currentProfit = price[i] - buyPrice;

            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }
}
