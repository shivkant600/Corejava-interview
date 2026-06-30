package com.rays.javaBasic;

public class TestSwitchCase {

	public static void main(String[] args) {

		int num = 1;
		String day = null;

		switch (num) {

		case 1:
			day = "Monday";
			break;

		case 2:
			day = "Tuesday";
			break;

		default:
			day = "Invalid day";
		}
		System.out.println(day);
	}
}