package com.java.programming.LeetCode;

import java.util.Arrays;

public class LongestCommonSuffix {

    public static void main(String[] args) {
        String[] str = {"automation", "nation", "station"};
        System.out.println(findTheLongestCommonSuffix(str)); // "ation"
    }

    static String findTheLongestCommonSuffix(String[] str) {
        if (str == null || str.length == 0) return "";
        // If any element is null or empty, there can't be a meaningful common suffix
        for (String s : str) {
            if (s == null || s.isEmpty()) return "";
        }
        if (str.length == 1) return str[0]; // single string => itself is both prefix and suffix

        Arrays.sort(str); // O(n log n * L)

        String str1 = str[0];
        String str2 = str[str.length - 1];

        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int commonLength = 0;

        while (i >= 0 && j >= 0 && str1.charAt(i) == str2.charAt(j)) {
            commonLength++;
            i--;
            j--;
        }

        return commonLength == 0 ? "" : str1.substring(str1.length() - commonLength);
    }
}
