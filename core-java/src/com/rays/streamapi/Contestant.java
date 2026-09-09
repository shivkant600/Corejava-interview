package com.rays.streamapi;

public class Contestant {

	String name;
	String phoneNo;

	public Contestant(String name, String phoneNo) {

		this.name = name;
		this.phoneNo = phoneNo;
	}

	public String toString() {
		return name + " " + phoneNo;
	}

}