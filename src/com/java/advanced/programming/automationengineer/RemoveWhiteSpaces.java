package com.java.advanced.programming.automationengineer;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String s = "SDET Java Programmer";
		s = s.replaceAll("\\s", "");
		System.out.println(s);

	}

}
