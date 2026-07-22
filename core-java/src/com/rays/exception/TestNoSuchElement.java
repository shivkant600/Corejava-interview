package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class TestNoSuchElement {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("a");
		list.add("b");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			//it.next();
			
		}

		try {
			System.out.println(it.next());
			
		} catch (NoSuchElementException e) {
			System.out.println(e);
			//System.exit(0);
		}finally {
			System.out.println("Final");
		}
		

	}

}