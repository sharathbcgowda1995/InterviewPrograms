package com.java.advanced.programming.LeetCode;

public class MinSizeSubArraySum {
    //    Input: target = 7, nums = [2,3,1,2,4,3]
    //    Output: 2
    //    Explanation: The subarray [4,3] has the minimal length under the problem constraint.

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(findMinSizeSubArray(arr,target));
    }

    static int findMinSizeSubArray(int[] arr, int target) {

        int high = 0;
        int low = 0;
        int currentSum = 0;
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSize = 0;

        // If currentSum is greater than or == to the target
        // then update the minWindowSize and update the currentWindow-arr[low]
        // update low to next element addition low++

        for (high = 0; high < arr.length; high++) {
            currentSum = currentSum + arr[high];
            while (currentSum >= target) {
                currentWindowSize = high - low + 1;
                minWindowSize = Math.min(minWindowSize, currentWindowSize);
                currentSum = currentSum - arr[low];
                low++;
            }
        }

        return minWindowSize;
    }
}
