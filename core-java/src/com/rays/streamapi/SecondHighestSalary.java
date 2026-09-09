package com.rays.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Alice", 5000));
		list.add(new Employee("Bob", 7000));
		list.add(new Employee("Charlie", 6000));
		list.add(new Employee("David", 8000));

		double secondHighestSalary = list.stream().map(e -> e.getSalary()).distinct()
				.sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0.0);

		System.out.println("Second highest salary: " + secondHighestSalary);
	}
}