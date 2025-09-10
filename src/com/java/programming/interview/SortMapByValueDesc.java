package com.java.programming.interview;

import java.util.*;

public class SortMapByValueDesc {
    public static void main(String[] args) {
        // Create a map with the given values
        Map<String, Integer> map = new HashMap<>();
        map.put("Mark", 100);    // Add Mark with value 100
        map.put("Jhon", 500);    // Add Jhon with value 500
        map.put("Sam", 50);      // Add Sam with value 50
        map.put("Tom", 125);     // Add Tom with value 125

        // Convert the map entries to a list for sorting
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list in descending order based on values
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Print the sorted entries
        System.out.println("Descending order by value:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
