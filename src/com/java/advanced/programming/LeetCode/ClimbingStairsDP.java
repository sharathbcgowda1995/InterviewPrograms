package com.java.advanced.programming.LeetCode;

public class ClimbingStairsDP {

    //    Input: n = 3
//    Output: 3
// Time and space complexity is O(n)
    public static void main(String[] args) {

        int n = 8;
        System.out.println(findNumberOfDistinctWaysToClimb(n));

    }

    public static int findNumberOfDistinctWaysToClimb(int n) {
        if (n == 1) {
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[1] = 1; // possible way to climb step 1 is 1
        arr[2] = 2; // possible way to climb step 2 is 2
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
