package com.java.programming.LeetCode;

public class PrintCharAndCount {

    public static void findCharCount(String word) {
        if (word == null || word.isEmpty()) { 
            System.out.println("Input string is empty or null");
            return;
        }

        int count = 1;  // Initialize the count as 1 for the first character
        String newWord = "";  // To store the result
        char[] arr = word.toCharArray();

        // Loop through the characters starting from the second character
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;  // Increment count if the current character matches the previous one
            } else {
                newWord = newWord + arr[i - 1] + count;  // Append the previous character and its count
                count = 1;  // Reset count for the new character
            }
        }

        // Manually handle the last character after the loop finishes
        newWord = newWord + arr[arr.length - 1] + count;

        // Print the result
        System.out.println(newWord);
    }

    public static void main(String[] args) {
        String name = "AABBCCCAAs";
        findCharCount(name);  // Expected output: "A2B2C3A2"
    }
}
