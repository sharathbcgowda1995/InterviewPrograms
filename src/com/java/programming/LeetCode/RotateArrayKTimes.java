package com.java.programming.LeetCode;
import java.util.*;

public class RotateArrayKTimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        reverseArrayToLeftByKTimes(arr,k);
        reverseArrayToRightByKTimes(arr,k);
    }
    public static void reverseArrayToLeftByKTimes(int[] arr, int k){
        for (int r = 0; r < k; r++) {
            int first = arr[0]; // store first element
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1]; // shift left
            }
            arr[arr.length - 1] = first; // put first element at end
        }

        System.out.println("Rotated: " + Arrays.toString(arr));
    }

    public static void reverseArrayToRightByKTimes(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // normalize k if k > n

        for (int r = 0; r < k; r++) {
            int lastElement = arr[n - 1]; // store last element
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1]; // shift right
            }
            arr[0] = lastElement; // put last element at front
        }
        System.out.println("Rotated right : " + Arrays.toString(arr));
    }

}

