package com.rays.oop;

public class ImmutableTest {

	public static void main(String[] args) {

		// Immutable class ka object bana
		// Constructor ko "shivkant" pass kiya
		Immutable i = new Immutable("shivkant");

		
		// Getter se name print kar rahe hain
		System.out.println(i.getName());
	}
}