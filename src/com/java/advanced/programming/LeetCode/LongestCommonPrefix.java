package com.java.advanced.programming.LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {

    //    Input: strs = ["flower","flow","flight"]
    //    Output: "fl"
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(findTheLongestCommonPrefix(str));
    }

    static String findTheLongestCommonPrefix(String[] str) {
        // 1. First sort it
        Arrays.sort(str);

        // 2. Compare the frst and last index as it's sorted and
        // if there's matching then rest of them(middle elements of string) will also have that prefix
        String str1 = str[0];
        String str2 = str[str.length - 1];
        int index = 0;
        while (index < str1.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                //Do Nothing - Just  go to next index so that idex will be the truth of match
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : str1.substring(0, index);
    }
}
