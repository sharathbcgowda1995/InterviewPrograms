package com.java.advanced.programming;

import java.util.ArrayList;
import java.util.HashMap;

public class FindTheOcuurence {

	public static void findWordOccurence(String word){

		//1
		String[] arr = word.split(" ");

		//2
		HashMap<String, Integer> map = new HashMap<>();

		//3
		for (String str : arr) {

			if(!map.containsKey(str)) {
				map.put(str, 1);
			}else {
				map.put(str, map.get(str)+1);
			}

		}
		System.out.println(map);
	}

	//Using charAt(index) method
	public static void findCharOccurence(String charcters) {

		HashMap<Character,Integer> map2 =  new HashMap<>();

		for (int i = 0; i < charcters.length(); i++) {

			if(!map2.containsKey(charcters.charAt(i))) {
				map2.put(charcters.charAt(i), 1);
			}else {
				map2.put(charcters.charAt(i), map2.get(charcters.charAt(i)) + 1);
			}

		}
		
		System.out.println(map2);

	}
	
	//Using toCharArray() method
	public static void findCharOccurence2(String charcters) {

		HashMap<Character,Integer> map2 =  new HashMap<>();
		
		char[] arr  = charcters.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			if(!map2.containsKey(arr[i])){
				map2.put(arr[i], 1);
			}else {
				map2.put(arr[i], map2.get(arr[i]) + 1);
			}

		}
		
		System.out.println(map2);

	}

	public static void main(String[] args) {

		String strWord ="I am Java developer I am proud of it";

		String strCharacters = "Sharath";

		findWordOccurence(strWord);

		findCharOccurence(strCharacters);
		
		findCharOccurence2(strCharacters);

	}

}
