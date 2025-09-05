package com.java.programming.LeetCode;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSumZero {

//    Input: nums = [-1,0,1,2,-1,-4]
//    Output: [[-1,-1,2],[-1,0,1]]
//    Get the unique pairs of elements that qill be summing to zero

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] arr) {

        // 1. Sort the array
        Arrays.sort(arr);

        //2. To store the unique values combination that will form 0
        HashSet<List<Integer>> result = new HashSet<>();

        //3. Take one index fixed with checking other combinations
        for (int i = 0; i < arr.length; i++) {

            //4. Other combinations
            int start = i + 1;
            int end = arr.length - 1;
            int sum = 0;

            while (start < end) {
                sum = arr[i] + arr[start] + arr[end];
                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[start], arr[end]));
                    start++;
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
