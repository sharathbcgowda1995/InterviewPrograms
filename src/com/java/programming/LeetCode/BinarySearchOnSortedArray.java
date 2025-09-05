package com.java.programming.LeetCode;

public class BinarySearchOnSortedArray {

    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;  // Replaced left and right with start and end

        while (start <= end) {
            int mid = start + (end - start) / 2;  // Binary search formula

            if (arr[mid] == target) {
                return mid;  // Target found, return the index
            } else if (target > arr[mid]) {
                start = mid + 1;  // Move the start pointer
            } else {
                end = mid - 1;  // Move the end pointer
            }
        }

        return -1;  // Return -1 if target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}
