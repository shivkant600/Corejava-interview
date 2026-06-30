package com.rays.javaBasic;

@FunctionalInterface
public interface FunctionalInt {

	public int sum(int a, int b);
	
	

	public static void sub(int a, int b) { // static naam say calll hotiii haiii

		System.out.println(a - b);
	}

	public default void multi(int a, int b) { // object say calll hooo giiii

		System.out.println(a * b);
	}

}