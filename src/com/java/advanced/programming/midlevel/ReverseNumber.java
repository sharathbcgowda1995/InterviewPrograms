package com.java.advanced.programming.midlevel;
import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number to reverse : ");
		
		int num = sc.nextInt();
		
		//Using Algorithn
		/*int rev = 0;
		while (num!=0) {
			rev = rev*10 + num%10 ; //reminder
			num =num/10 ; //divider
		}*/
		
		//Using Stringbuffer
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();		
		
		System.out.println("Reversed number is : " + rev);
	}

}
