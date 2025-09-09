package com.java.programming.LeetCode.optimised;

import java.util.HashMap;

public class TargetSumUsingMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 5;
        int[] resultArr = findSumIndexUsingMap(arr, targetSum);

        if (resultArr != null) {
            System.out.println("Indexes are : " + resultArr[0] + " " + resultArr[1]);
        } else {
            System.out.println("Match not found");
        }
    }

    public static int[] findSumIndexUsingMap(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] resultArrayPositions = new int[2];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            int value = target - arr[i];

            if (map.containsKey(value)) {

                resultArrayPositions[0] = i;
                resultArrayPositions[1] = map.get(value);
                return resultArrayPositions;

            } else {

                map.put(arr[i], i);
            }

        }
        return null;
    }

}
/*
Time Complexity = O(n)
Space Complexity = O(n)
 */