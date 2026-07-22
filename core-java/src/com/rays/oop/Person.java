package com.rays.oop;

import java.util.Date;

	public class Person {

	    private String firstName;
	    private String lastName;
	    private Date dob;
	    private int mobNo;

	    public static final String COMPANY_NAME = "ABC Pvt Ltd";

	    
	    
	    //default constructor
	    public Person() {
	    }

	    //peramitize constructor
	    public Person(String firstName, String lastName, Date dob, int mobNo) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dob = dob;
	        this.mobNo = mobNo;
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

	    public Date getDob() {
	        return dob;
	    }

	    public void setDob(Date dob) {
	        this.dob = dob;
	    }

	    public int getMobNo() {
	        return mobNo;
	    }

	    public void setMobNo(int mobNo) {
	        this.mobNo = mobNo;
	    }
	}

