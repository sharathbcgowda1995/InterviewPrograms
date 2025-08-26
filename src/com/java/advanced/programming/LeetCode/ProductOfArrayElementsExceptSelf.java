package com.java.advanced.programming.LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductOfArrayElementsExceptSelf {

//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]

// Logic implementation :
//    left : | 1  |1  |2 | 6|
//    right :| 24 |12 |4 | 1|

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }


    public static int[] productExceptSelf(int[] arr) {
        int[] resultArray = new int[arr.length];

        int ProductL = 1;
        int ProductR = 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            resultArray[i] = ProductR;
            ProductR = arr[i] * ProductR;
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            resultArray[i] = resultArray[i] * ProductL;
            ProductL = ProductL * arr[i];
        }

        return resultArray;
    }
}
