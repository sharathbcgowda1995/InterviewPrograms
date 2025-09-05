package com.java.programming.LeetCode;

public class GreatestCommonDivisorOfStrings {
    /*
str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

[
Step 1: Check if concatenation matches
Step 2: Find gcd of lengths
len(str1) = 6
len(str2) = 3
gcd(6, 3) = 3
Step 3: Take substring of length gcd
str1.substring(0, 3) = "ABC"
Step 4: Verify
Check if both str1 and str2 are multiples of "ABC":
"ABCABC" → "ABC" repeated 2 times
"ABC" → "ABC" repeated 1 time
]

str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

str1 = "LEET", str2 = "CODE"
Output: ""
     */

    public static void main(String[] args) {
        String str1 = "ABABAB", str2 = "AB";
        System.out.println(gcdOfStrings(str1,str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        // If str1 + str2 != str2 + str1, there is no common divisor string
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Return substring from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper function to find gcd of two numbers
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
