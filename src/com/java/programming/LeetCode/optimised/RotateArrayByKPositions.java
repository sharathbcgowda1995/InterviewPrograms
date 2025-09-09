package com.java.programming.LeetCode.optimised;

import java.util.Arrays;

class RotateArrayByKPositions {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int k = 3;
        rotateRightShift(arr1, k);
        rotateLeftShift(arr2, k);
    }

    public static void rotateRightShift(int[] nums, int k) {
        k = k % nums.length; // normalize k
        reverse(nums, 0, nums.length - 1);  // reverse entire array
        reverse(nums, 0, k - 1);           // reverse first k elements
        reverse(nums, k, nums.length - 1);      // reverse rest
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--; // ✅ important
        }
    }

    public static void rotateLeftShift(int[] nums, int k) {
        k = k % nums.length; // normalize k
        reverse(nums, 0, k - 1);            // reverse first k elements
        reverse(nums, k, nums.length - 1);       // reverse rest
        reverse(nums, 0, nums.length - 1); // reverse entire array
        System.out.println(Arrays.toString(nums));
    }
}
/*
Time Complexity = O(n)
Space Complexity = O(1)
 */