package com.java.concepts;

public class FindingTheSum {

	public static void main(String[] args) {
		String str = "abccdefgaa";
		int sum1 = str.length();
		int sum2 = str.replaceAll("c", "").length();
		int numberOfOccrence = sum1 - sum2;
		System.out.println("a has occured : " + numberOfOccrence + " times ");
	}
}
