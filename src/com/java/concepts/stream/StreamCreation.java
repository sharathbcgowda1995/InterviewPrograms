//package com.java.concepts.stream;
//
//import java.util.*;
//import java.util.stream.*;
//
//public class StreamCreation {
//    public static void main(String[] args) {
//        // 1. From a collection
//        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        Stream<Integer> s1 = list.stream();
//        s1.forEach(n -> System.out.println(n + " "));
//
//        // 2. From an array
//        int[] arr = {1, 2, 3};
//        IntStream s2 = Arrays.stream(arr);
//        s2.forEach(n -> System.out.println(n + " "));
//
//        // 3. Using Stream.of()
//        Stream<String> s3 = Stream.of("a", "b", "c");
//        s3.forEach(n -> System.out.println(n + " "));
//
//        // 4. Using Stream.generate() (infinite stream, needs limit)
//        Stream<Double> s4 = Stream.generate(Math::random).limit(3);
//        s4.forEach(n -> System.out.println(n + " "));
//
//        // 5. Using Stream.iterate()
//        Stream<Integer> s5 = Stream.iterate(1, n -> n + 2).limit(5);
//        s5.forEach(n -> System.out.println(n + " "));
//
//        // 6. Using empty()
//        Stream<String> empty = Stream.empty();
//
//
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
//        // Sequential stream
//        nums.stream().forEach(n -> System.out.print(n + " "));
//        // Parallel stream
//        nums.parallelStream().forEach(n -> System.out.print(n + " "));
//
//        List<String> names = Arrays.asList("Sharath", "Tech");
//        List<Integer> lengths = names.stream().map(String::length).toList();
//        System.out.println(lengths); // [7, 4]
//
//        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
//
//        List<Integer> flat = list.stream().flatMap(l -> l.stream()).toList();
//        System.out.println(flat); // [1, 2, 3, 4]
//
//        //4. Difference between Intermediate and Terminal operations
//
//        List<String> names = Arrays.asList("Sharath", "Tech", "Streams");
//
//        long count = names.stream().filter(n -> n.length() > 5)  // Intermediate
//                .count();                     // Terminal
//
//        System.out.println(count); // 2
//
//
//        //5. What is Lazy Evaluation in Streams?
//        List<String> list = Arrays.asList("a", "bb", "ccc");
//
//        list.stream().map(s -> {
//            System.out.println("Mapping: " + s);
//            return s.toUpperCase();
//        }).filter(s -> {
//            System.out.println("Filtering: " + s);
//            return s.length() > 1;
//        });
//        // 👉 Nothing printed yet (no terminal op)
//
//        System.out.println("Now terminal op:");
//        list.stream().map(s -> {
//            System.out.println("Mapping: " + s);
//            return s.toUpperCase();
//        }).filter(s -> {
//            System.out.println("Filtering: " + s);
//            return s.length() > 1;
//        }).count(); // Trigger execution
//
//
//    }
//}
