package com.rays.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add("Ram");
		list.add("Shyam");
		list.add("lakhan");

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}
		System.out.println(list.indexOf("Shyam"));
		System.out.println(list.get(1));
		list.set(2, "man");
		System.out.println(list);
	}

}