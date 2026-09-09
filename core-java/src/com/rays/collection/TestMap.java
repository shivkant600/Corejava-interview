package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(4, "Four");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");

//		map.clear();

//		map.remove(1);

		System.out.println(map.get(1));

		System.out.println(map.containsKey(1));

		System.out.println(map.containsValue("Two"));

		System.out.println(map);

		
		
	}

}