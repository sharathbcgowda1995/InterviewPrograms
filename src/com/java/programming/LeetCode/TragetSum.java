package com.java.programming.LeetCode;

public class TragetSum { // Corrected class name

    public static void findSumIndex(int[] arr, int targetSum) {
        boolean found = false; // To check if at least one pair exists
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Indexes are: " + i + " " + j);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found with sum " + targetSum);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 5;
        findSumIndex(arr, targetSum);
    }
}
