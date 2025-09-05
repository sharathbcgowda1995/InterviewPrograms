package com.java.javanotes.concepts;

public class ToFindTheVowel {

	public static void main(String[] args) {

		String name = "Sharath B C";
		int count = 0;
		char var = 0;

		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

		char[] name_Array = name.toCharArray();

		for (int i = 0; i < vowels.length; i++) {

			for (int j = 0; j < name_Array.length; j++) {
				// elements
				if (vowels[i] == name_Array[j]) {
					var = name_Array[j];
					count++;
				}

			}
		}
		if (count > 1) {
			System.out.println(count);
			System.out.println(var);
		}

	}

}
