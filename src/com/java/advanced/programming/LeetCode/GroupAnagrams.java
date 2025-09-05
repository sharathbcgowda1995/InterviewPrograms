package com.java.advanced.programming.LeetCode;

import java.util.*;

// Over all logic is to have the sorted key and while iteration having the sorted string 
// and if that key present already grouping to that sorted key.

public class GroupAnagrams {
	
	public static HashMap<String, List<String>> groupAllAnagrams(String[] str) {

		//1. Create map to store the sorted key an groups of anagrams
		HashMap<String, List<String>> map = new HashMap<>();

		for (String stringValue : str) {

			//2. Iterate the each string array and convert to array to perform the sorting to store as key
			char[] arr  = stringValue.toCharArray();
			Arrays.sort(arr);

			//3. Convert the sorted array to String to store the key.
			String key = String.valueOf(arr);

			//4. Create new key if key is not present
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList());
			}

			//5. If key is present then add the actual string anagram to sorted key.
			map.get(key).add(stringValue);

		}
		System.out.println(map);
		return map;
	}

	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		//6. Receive it and iterate.
		HashMap<String, List<String>> groupOfAnagrams  = groupAllAnagrams(strs);
		for(Map.Entry<String, List<String>> mapvalue : groupOfAnagrams.entrySet()) {
			System.out.println(mapvalue.getValue());
		}
		System.out.println(groupOfAnagrams);
	}
}
