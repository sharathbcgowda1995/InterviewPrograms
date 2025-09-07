package com.java.javanotes.concepts.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;


public class StreamConcepts {

	static public void streamConcepts() {

		ArrayList<String> names = new ArrayList<>();
		names.add("sharath");
		names.add("Bharath");
		names.add("Nags");

		names.stream().filter(s -> s.startsWith("N")).forEach(s -> System.out.println(s));

		// To print the elements in the collections we have to go for the loops but we
		// can do the same using streams
		Stream.of("Sharath", "Bharath", "Sanju").map(s -> s.toUpperCase())
				.forEach(s -> System.out.println("Using independent stram elements : " + s));

		// We can limit using the limit functionality
		Stream.of("Amma", "Appa", "Putti").filter(s -> s.startsWith("A")).limit(2).forEach(s -> System.out.println(s));

		// Adding two lists or data into the newStream using the concat method.
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Sharath");
		list1.add("Pavan");

		String[] arr2 = { "Baby", "Ambika", "Sandesh" };

		Stream<String> newStream = Stream.concat(list1.stream(), Arrays.asList(arr2).stream());
		// newStream.forEach(s->System.out.println(s));

		// Finding the anyMatch
		Boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Baby"));
		System.out.println(flag);

	}

	public static void main(String[] args) {
		streamConcepts();
	}

}
