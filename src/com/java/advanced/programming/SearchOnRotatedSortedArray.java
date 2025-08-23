package com.java.advanced.programming;

public class SearchOnRotatedSortedArray {

    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the mid element is the target
            if (arr[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (arr[start] <= arr[mid]) {  // Left half is sorted
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;  // Search in the left half
                } else {
                    start = mid + 1;  // Search in the right half
                }
            } else {  // Right half is sorted
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;  // Search in the right half
                } else {
                    end = mid - 1;  // Search in the left half
                }
            }
        }
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int target = 3;
        int index = search(arr, target);

        if (index != -1) {
            System.out.println("Target index is : " + index);
        } else {
            System.out.println("Target index not found");
        }
    }
}
