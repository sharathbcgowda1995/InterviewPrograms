package com.java.advanced.programming.midlevel;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse :");
		String name = sc.nextLine();
		String rev = "";

		// concatenation
		/*for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}*/
		
		//Using characterArray
		char[] characters = name.toCharArray();
		
		System.out.println(characters);
		
		for (int i=characters.length-1 ;i>=0 ; i--) {
			rev=rev+characters[i];
		}
		
		System.out.println(rev);

	}

}
