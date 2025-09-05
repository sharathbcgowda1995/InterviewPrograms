package com.java.programming.LeetCode;
//Time Complexity: O(N)
//Space Complexity: O(1)
public class FindArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}, n = 5;
        System.out.println("is array sorted : " + findArrayIsSorted(arr, n));
    }

    public static boolean findArrayIsSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
