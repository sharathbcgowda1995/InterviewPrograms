package com.java.programming.LeetCode;

import java.util.Arrays;

//input:
//int[] arr = {3,2,2,3};
//int val = 3;
//output : 2
public class RemoveElements {

    public static void main(String[] args) {

        int[] arr = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeAndReturnCounterValue(arr, val));
    }

    // We just have to move the other than value elements to the front of the array and
    // we have to count the same and return it.
    static int removeAndReturnCounterValue(int[] arr, int val) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                // do nothing
            } else {
                arr[counter] = arr[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return counter;
    }


}
