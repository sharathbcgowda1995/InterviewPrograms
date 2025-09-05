package com.java.programming.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    //    Input: nums = [1,1,1,2,2,3], k = 2
    //    Output: [1,2]

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = findKTopFrequent(arr, k);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static HashMap<Integer, Integer> findTheFrequentCount(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        return map;
    }

    public static int[] findKTopFrequent(int[] arr, int k) {

        // Step 1 : Find occurrences
        HashMap<Integer, Integer> map = findTheFrequentCount(arr);
        System.out.println(map);

        // Step 2 : Store in a bucket
        List<Integer>[] bucket = new List[arr.length + 1];

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        // Step 3 : Traverse the bucket from the end to get k highest
        int[] mostFrequentElements = new int[k];
        int counter = 0;
        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if (bucket[pos] != null) {
                for (int element : bucket[pos]) {
                    // Step 4: Limit to the top K[2] elements
                    if (counter < k) {
                        mostFrequentElements[counter] = element;
                        counter++;
                    }
                }
            }
        }
        return mostFrequentElements;
    }
}
