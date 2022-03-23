package com.java.programming;

public class RemoveJunkUsingRegEx {

	public static void main(String[] args) {

		String s = "API @#$%^&* Automation@#$%^& Using@# Rest$%";

		//whatever we pass in first argument will be there and the remaining will be removed as per whatever we pass in the second argument.
		s = s.replaceAll("[^a-zA-Z0-9 ]", "asa");
		System.out.println(s);
	}

}
