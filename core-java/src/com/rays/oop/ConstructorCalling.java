package com.rays.oop;

public class ConstructorCalling {
	
	
	//MULTIPLE CONSTRUCTOR WITH DIFFERENT PARAMETER IS CALLED CONSTRUCTORCALLING

	public String fName;

	public String lName;

	public ConstructorCalling() {
		System.out.println("Default Constructor.........");
	}

	public ConstructorCalling(String fName) {
		
		//same class mai constructor ko call kar nai kai liya this keyword ka use kar tAI HAI 
		this();
		this.fName = fName;
		System.out.println(fName);
	}

	public ConstructorCalling(String fName, String lName) {

		this(fName);

		this.lName = lName;

		System.out.println(lName);
	}
}