package com.rays.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {

	public static void main(String[] args) {

		SortedMap m = new TreeMap();

		m.put(2, "Ram");
		m.put(1, "Shyam");
		m.put(3, "Lakhan");
		m.put(4, "LakhanPrajapat");

		System.out.println(m.lastKey());
		
		System.out.println(m.firstKey());
		System.out.println(m.headMap(2));// headmap mtb aange ka data return kara gaaa 2 include nhiii raha gaa
		
		
		System.out.println(m.tailMap(2));  // tail map baad kaa ya peecha ka data return kara gaa oorrr 2 vinclude raha gaa
		
		System.out.println(m.subMap(2, 4));  // beech kaaa 4 nhiii raha gaa 2 raha gAA
		
		System.out.println(m.entrySet());

		System.out.println(m);
	}

}