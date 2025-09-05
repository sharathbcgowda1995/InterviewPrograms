package com.java.programming.LeetCode;

//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6

// Link : https://docs.google.com/document/d/1LS1ap3uXQo3nMdd8LjTaQ0cSGXS_NpSbr1xkmQOO3jw/edit?tab=t.0

public class MaximumSubArraySum {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSumOfSubArray(arr));

    }

    public static int maximumSumOfSubArray(int[] arr) {
        int sum = 0;
        int max_sum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (sum < 0) {
                sum = 0;
            }

            if (sum > max_sum) {
                max_sum = sum;
            }
        }
        return max_sum;
    }

}
