package com.java.concepts;

public class StringConcepts {

	public static void main(String[] args) {
		String str = new String("Sharath");
		
		System.out.println(str.hashCode());
		
		String str2 = "Sharath";
		
		System.out.println(str2.hashCode());
		
		System.out.println(str == str2);//False
		
		String str3 = "Sharath";
		
		System.out.println(str3 == str2);//True

	}

}
