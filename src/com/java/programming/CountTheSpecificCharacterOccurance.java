package com.java.programming;

public class CountTheSpecificCharacterOccurance {

	public static void main(String[] args) {
		
		String s = "Sharath bc gowda";
		int total_count = s.length();
		int after_count = s.replaceAll("a", "").length();
		
		int occurenceOf_a = total_count - after_count;
		
		System.out.println("Occurence of 'a' in string is: " + occurenceOf_a);

	}

}
