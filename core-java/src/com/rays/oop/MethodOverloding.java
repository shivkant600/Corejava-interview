package com.rays.oop;

public class MethodOverloding {
	
	//METHODOVERLOADING MEANS MULTIPLE METHOD WITH DIFFERENT PARAMETER

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		
		
		//METHOD KO CALL KAR KAI DATA DALA HAI
		MethodOverloding m = new MethodOverloding();

		System.out.println(m.sum(17, 20));
		System.out.println(m.sum(5, 6, 7));
	}
}