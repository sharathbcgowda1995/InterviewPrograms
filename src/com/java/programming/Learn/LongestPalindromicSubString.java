package com.java.programming.Learn;

public class LongestPalindromicSubString {

	public static String longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		// Variable to store the starting index of the longest palindrome
		int start = 0;
		int maxLength = 1; // Minimum palindrome length is 1 (any single character is a palindrome)

		for (int i = 0; i < s.length(); i++) {

			// Check for odd-length palindrome centered at i
			int len1 = countSubstrings(s, i, i);

			// Check for even-length palindrome centered between i and i+1
			int len2 = countSubstrings(s, i, i + 1);

			// The maximum length of both cases
			int len = Math.max(len1, len2);

			// If we find a longer palindrome, update the starting index and the max length
			if (len > maxLength) {
				maxLength = len;
				start = i - (len - 1) / 2;  // Calculate the start index of the palindrome
			}
		}

		// Return the longest palindrome substring
		return s.substring(start, start + maxLength);
	}

	// Helper method to expand around the center and return the length of the palindrome
	public static int countSubstrings(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1; // The length of the palindrome
	}

	public static void main(String[] args) {

		String word = "ABAswr";
		System.out.println(longestPalindrome(word)); // Output: ABA
	}
}
