package com.rays.collection.comparable;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {

		if (this.name == o.name) {
			
			//first name sab say compare kara gaa fir dusra say compare kara gaa
			return this.salary - o.salary;
		}
		return this.name.compareTo(o.name);
	}

//	
//	@Override
//	public int compareTo(Employee o) {
//
//		if (this.name == o.name) {
//			return 0;
//		} else if (this.name.compareTo(o.name) > 0) {
//			return 1;
//		} else {
//			return -1;
//		}
//
//	}
//	
//	
	
	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}
}