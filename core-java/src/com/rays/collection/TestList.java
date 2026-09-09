package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');

		List l = new ArrayList();

		l.add('d');
		l.add('e');
		l.add('f');
		l.add('z');

		// list.clear();
		// list.remove(2);

		System.out.println(list);

		list.add(1, "hii");
		System.out.println(list);

		System.out.println(list.subList(1, 4));
		System.out.println(list);

		System.out.println(list.get(2));

		System.out.println(list.contains('a'));
		System.out.println(list.containsAll(l));

		list.addAll(l);
		System.out.println(list);

	}
}