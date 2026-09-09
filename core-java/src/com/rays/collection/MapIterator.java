package com.rays.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapIterator {
	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "Ram");
		m.put(2, "Shyam");
		m.put(3, "Lakhan");
		m.put(4, null);

		System.out.println(m);

		
		//entryset key value pair mai set return karta hAII
		for (Object o : m.entrySet()) {
			System.out.println(o);
		}

		for (Object o : m.values()) {
			System.out.println(o);
		}

		for (Object o : m.keySet()) {
			System.out.println(o);
		}

//		TreeMap t = new TreeMap();
//		t.put(1, "Ram");
//		t.put(3, "Shyam");
//		t.put(2, "Lakhan");
//		t.put(4, null);
//
//		for (Object o : t.keySet()) {
//			System.out.println(o);
//		}
	}
}