package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {

		List list = new ArrayList();

		
		list.add(new Employee(1, "Anand", 5000));
		list.add(new Employee(3, "Ravi", 7000));
		list.add(new Employee(2, "Raj", 5000));
		list.add(new Employee(4, "Anand", 4000));
		

		Collections.sort(list);

		for (Object o : list) {

			System.out.println(o);
		}
	}

}