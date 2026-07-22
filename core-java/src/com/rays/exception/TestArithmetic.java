package com.rays.exception;

public class TestArithmetic {

	public static void main(String[] args) {

		int a = 10;
		
		
		try {

			int c = a / 0;
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.exit(0);
			
		} finally {
			System.out.println("shivkant");
		}
	}
}