package com.java.advanced.programming.LeetCode;

import java.util.HashSet;

public class LengthOfMaxSubString {

    public static int findStringLength(String st) {
        // HashSet to store characters in the current window
        HashSet<Character> set = new HashSet<>();

        int start = 0; // Left pointer of the window
        int maxLength = 0; // Maximum length of substring

        // Loop over the string with the right pointer `end`
        for (int end = 0; end < st.length(); end++) {

            // If the character at 'end' is already in the set, move `start` to the right
            while (set.contains(st.charAt(end))) {
                set.remove(st.charAt(start));
                start++; // Move the start pointer to the right to remove the duplicate character
            }

            // Add the current character at 'end' to the set
            set.add(st.charAt(end));

            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength; // Return the length of the longest substring without repeating characters
    }

    public static void main(String[] args) {
        String value = "abcdefgghhg"; // Test string
        System.out.println(LengthOfMaxSubString.findStringLength(value)); // Output should be 6 for "abcdef"
    }
}
