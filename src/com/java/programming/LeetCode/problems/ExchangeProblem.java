package com.java.programming.LeetCode.problems;

public class ExchangeProblem {

    public static int findTotalItems(int money, int costPerItem, int exchangeRate) {
        // Step 1: Buy as many items as possible with money
        int items = money / costPerItem;
        int total = items;
        int wrappers = items;

        // Step 2: Keep exchanging wrappers until not enough
        while (wrappers >= exchangeRate) {
            int newItems = wrappers / exchangeRate;  // new items from wrappers
            total += newItems;
            wrappers = (wrappers % exchangeRate) + newItems;  // leftover + new wrappers
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("Bottles with 100₹: " + findTotalItems(100, 10, 4));
        System.out.println("Chocolates with 15₹: " + findTotalItems(15, 3, 2));
        System.out.println("Cigarettes with 5 sticks: " + findTotalItems(5, 1, 2));
        System.out.println("Beers with 20₹: " + findTotalItems(20, 2, 5));
    }
}
