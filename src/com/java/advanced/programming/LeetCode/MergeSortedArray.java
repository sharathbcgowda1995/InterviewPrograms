package com.java.advanced.programming.LeetCode;

public class MergeSortedArray {

    //    88. Merge Sorted Array
//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] arr2 = {2, 5, 6};
        int n = 3;
        int[] resultArray = mergeTheSortedArray(arr1, m, arr2, n);
        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeTheSortedArray(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0 && i >= 0) {
        // here just make sure we can place the i>=0 cond as if (i>=0 && arr1[i] > arr2[j]) as well.
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                k--;
                i--;
            } else {
                arr1[k] = arr2[j];
                k--;
                j--;
            }

        }

        return arr1;

    }
}
