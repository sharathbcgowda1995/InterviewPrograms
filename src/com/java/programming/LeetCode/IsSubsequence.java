package com.java.programming.LeetCode;

public class IsSubsequence {
    //    Input: s = "abc", t = "ahbgdc"
//    Output: true
    public static void main(String[] args) {
        String s = "bca", t = "ahbgdca";
        System.out.println(findIsSubsequence(s, t));
    }

    static boolean findIsSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == s.length()) {
            return true;
        }
        return false;
    }
}