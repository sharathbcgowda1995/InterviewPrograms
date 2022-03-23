package com.java.programming;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		
		String name = sc.nextLine();
		
		String originalName = name;
		
		char[] characters = name.toCharArray();
		
		String rev = "";
		
		for(int i = characters.length-1 ; i>=0 ; i--) {
			rev=rev + characters[i];
		}
		
		System.out.println("Reveresed string is :" + rev);

		if(originalName.equals(rev)) {
			System.out.println(originalName + " is palindrome");
		}else {
			System.out.println(originalName + " is not palindrome");
		}
	}
	

}
