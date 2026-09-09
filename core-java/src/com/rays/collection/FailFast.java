package com.rays.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class FailFast {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add("Ram");
		list.add("Shyam");
		list.add("Lakhan");
		

		System.out.println(list);

		Iterator it = list.iterator();

		
		// ITERATOR KAA OBJECT BAN NAI KAI  BAAD DATA ADD KARA GAI TOO  EXCEPTION AAYA GII CONCRANTMODIFICATION EX
		list.add("Lakhan");

		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}