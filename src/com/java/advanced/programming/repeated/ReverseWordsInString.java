package com.java.advanced.programming.repeated;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String s = "Sharath BC Gowda";
		String[] split = s.split(" ");
		
//		StringBuilder sb = new StringBuilder(s);
//		System.out.println(sb.reverse());
		

		String reversedString = "";

		for (String r : split) {
			StringBuilder sb = new StringBuilder(r);
			reversedString = reversedString +  sb.reverse() + " ";
		}

		System.out.println(reversedString);
	}

}
