package com.rays.collection.equalHashCode;

public class Employee {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int hashCode() {
		System.out.println("In HashCode...");
		String str = id + name + salary;
		return str.hashCode();
	}

	public boolean equals(Object obj) {
		System.out.println("In Equals..");
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee e = (Employee) obj;
		boolean b = (this.id == e.id && this.name.equals(e.name) && this.salary == e.salary);
		return b;
	}

	public String toString() {
		return id + " " + name + " " + salary;
	}

}