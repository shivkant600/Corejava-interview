package com.rays.oop;

public interface MakeInterface {

	public static final String NANE = "Gautam";

	public static final int NUM = 1;

	public int sum(int a, int b);

	public static void staticMethod() {
		System.out.println("Static Method");
	}

	public default void defaulfMethod() {
		System.out.println("Default Method");
	}
}