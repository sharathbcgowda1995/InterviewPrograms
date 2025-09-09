package com.java.programming.LeetCode.progress;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(a1));
    }

    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
