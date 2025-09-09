package com.java.programming.LeetCode.optimised;

class RotateArrayByKPositions {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // normalize k
        reverse(nums, 0, nums.length - 1); // reverse entire array
        reverse(nums, 0, k - 1);           // reverse first k elements
        reverse(nums, k, nums.length - 1); // reverse rest
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--; // ✅ important
        }
    }
}
