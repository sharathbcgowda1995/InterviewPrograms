package com.java.javanotes.concepts.generic;

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
/*
Concepts involved:

String creation in Java

String str = new String("Sharath");
→ Creates a new object in the heap, even if "Sharath" already exists in the String Constant Pool (SCP).

String str2 = "Sharath";
→ String literals are stored in the SCP. If "Sharath" already exists in the pool, it will reuse the same reference.
 */