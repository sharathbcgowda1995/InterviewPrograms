package com.java.programming.interview;

public class ExactlyKReplacements {

    public static void main(String[] args) {
        System.out.println(canMakeEqual("abcd", "abef", 2)); // true
        System.out.println(canMakeEqual("abcd", "abcf", 1)); // true
        System.out.println(canMakeEqual("abcd", "abcd", 0)); // true
        System.out.println(canMakeEqual("abcd", "abcf", 2)); // false
    }

    public static boolean canMakeEqual(String s1, String s2, int k) {
        if (s1.length() != s2.length()){
            return false;
        }

        int mismatches = 0;

        // Count mismatched positions
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                mismatches++;
            }
        }

        // Exactly k replacements needed
        return mismatches == k;
    }
}
