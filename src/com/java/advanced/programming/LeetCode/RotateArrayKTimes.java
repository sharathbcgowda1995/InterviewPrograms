package com.java.advanced.programming.LeetCode;
import java.util.*;

public class RotateArrayKTimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5; // rotate left 3 times

        System.out.println("Original: " + Arrays.toString(arr));

        for (int r = 0; r < k; r++) {
            int first = arr[0]; // store first element
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1]; // shift left
            }
            arr[arr.length - 1] = first; // put first element at end
        }

        System.out.println("Rotated: " + Arrays.toString(arr));
    }
}

