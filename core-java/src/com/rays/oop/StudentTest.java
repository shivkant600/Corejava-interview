package com.rays.oop;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setId(1);
		s.setRollNo(1001);
		s.setFirstName("Gautam");
		s.setLastName("Gandhwani");
		
		System.out.println("Id = "+ s.getId());
		System.out.println("Roll NO. = "+ s.getRollNo());
		System.out.println("First Name = "+ s.getFirstName());
		System.out.println("Last Name = "+ s.getLastName());
	}
}