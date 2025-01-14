package com.java.advanced.programming.Learn;

public class CountPalindromicSubstrings {

	public static int countPalindromeSubstrings(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			//count palindromes with odd length
			count = count + countSubstrings(s,i,i);

			// count palindromes with even length
			count = count + countSubstrings(s,i,i+1);

		}

		return count;

	}

	public static int countSubstrings(String s, int left, int right) {

		int count = 0;

		while(left >= 0 && right < s.length() && s.charAt(left)== s.charAt(right)) {
			count ++;
			left--;
			right++;	
		}

		return count ;

	}

	public static void main(String[] args) {

		String word = "ABA";

		System.out.println(countPalindromeSubstrings(word));


	}

}
