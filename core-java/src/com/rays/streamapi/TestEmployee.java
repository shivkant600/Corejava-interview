package com.rays.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Ram", 70000));
		list.add(new Employee("Raj", 80000));
		list.add(new Employee("Ramu", 11000));
		list.add(new Employee("Ram", 50000));

//		double secondHighest = list.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1)
//				.findFirst().orElse(0.0);
//		System.out.println(secondHighest);

//		Employee secondHighest = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
//				.findFirst().orElse(null);
//		System.out.println(secondHighest.getName() + " " + secondHighest.getSalary());

		List<Employee> highPaidEmployees = list.stream().filter(employee -> employee.getSalary() > 20000)
				.collect(Collectors.toCollection(ArrayList::new));

		highPaidEmployees.forEach(employee -> System.out.println(employee.getName() + " " + employee.getSalary()));
	
	}
}