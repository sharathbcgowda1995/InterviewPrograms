package com.java.programming.LeetCode;

public class CountMaximumConsecutiveOnesInTheArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 0, 1, 1, 1};
        System.out.println(findTheMaximumConsecutive(arr));
    }

    public static int findTheMaximumConsecutive(int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count += 1;
            } else {
                count = 0;
            }
            max = Math.max(count, max);
        }
        return max;
    }

}
