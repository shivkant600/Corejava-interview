package com.rays.oop;

public class Student {

	private int id;
	
	private int rollNo;

	private String firstName;

	private String lastName;

	
	//constructor hamesa class kai name say ban taa haiii (yeh default constructor hai)
	public Student() {
	}

	
	
	// getter method ka return type attribute ka data type hoo taa haiii
	public int getId() {
		return id;
	}

	
	//setter ka  default void he reh taa haiii
	public void setId(int id) {
		this.id = id;
	}

	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}