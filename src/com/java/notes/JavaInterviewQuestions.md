package com.java.concepts;

public class StringConcepts {

	public static void main(String[] args) {
		String str = new String("Sharath");
		
		#Two String Objects are Created:
		
## One in the String Pool (interned):

> The string literal "ankit" is first looked up in the String Pool.
> If "ankit" does not already exist in the String Pool, it is added there.
> If "ankit" already exists in the String Pool, the existing object is reused.

##One on the Heap (new object):

> The new String("ankit") explicitly creates a new String object on the heap.
> This object is a distinct, new object that holds the value "ankit" and is not part of the String Pool.
> Even though its value is the same as the string literal "ankit", it's stored separately in memory.
		
		System.out.println(str.hashCode());
		
		String str2 = "Sharath";
		
		System.out.println(str2.hashCode());
		
		System.out.println(str == str2);//False
		
		String str3 = "Sharath";
		
		System.out.println(str3 == str2);//True

	}

}

