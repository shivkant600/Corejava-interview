package com.rays.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesByDepartmentId {
	public static void main(String[] args) {

		List<Employe> employees = new ArrayList<>();

		employees.add(new Employe("Ram", 2));
		employees.add(new Employe("Shyam", 1));
		employees.add(new Employe("Jay", 1));
		employees.add(new Employe("Vijay", 3));

		List<Employe> sortedEmployees = employees.stream().sorted(Comparator.comparingInt(Employe::getDepartmentId))
				.collect(Collectors.toCollection(ArrayList::new));

		sortedEmployees.forEach(employee -> System.out.println(employee.getName() + " " + employee.getDepartmentId()));

	}
}