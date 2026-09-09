package com.rays.streamapi;

public class Employe {
	private String name;
	private int departmentId;

	public Employe(String name, int departmentId) {
		this.name = name;
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public int getDepartmentId() {
		return departmentId;
	}
	
	public String toString() {
		return name+" "+departmentId;
	}
}