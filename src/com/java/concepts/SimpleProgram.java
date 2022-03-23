package com.java.concepts;

public class SimpleProgram {

	public static void main(String[] args) {

		String sentence = "Everyone 18 and older is eligible to get the vaccine against Covid-19. Availability may vary by state.";

		String splitted[] = sentence.split(" ");
		int count = 0;

		for (int i = 0; i < splitted.length; i++) {
			count =count + splitted[i].length();
		}

		System.out.println("Length of the string array : " + splitted.length);
		System.out.println("Total length of the String is : " + count);

	}

}
