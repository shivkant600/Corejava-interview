package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {

		Set s = new HashSet();

		s.add("null");
		s.add(null);
		s.add(1);
		
		s.add("1");
		

		System.out.println(s);
	}
}