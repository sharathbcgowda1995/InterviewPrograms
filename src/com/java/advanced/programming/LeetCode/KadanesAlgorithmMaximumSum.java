package com.java.advanced.programming.LeetCode;
//Time Complexity: O(N), where N = size of the array.
//Reason: We are using a single loop running N times.
//Space Complexity: O(1) as we are not using any extra space.
public class KadanesAlgorithmMaximumSum {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("The maximum sum is : " + findMaximumSumAndTheSubArrayOfIt(arr));
    }

    public static long findMaximumSumAndTheSubArrayOfIt(int[] arr) {
        long sum = 0;
        int startPoint = 0;
        int startIndex = -1;
        int endIndex = -1;
        long maxSum = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (sum == 0) {
                startPoint = i;
            }

            sum = sum + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                startIndex = startPoint;
                endIndex = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        // Print the subArray
        System.out.print("The sub array is [");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        return maxSum;
    }
}
