package com.rays.oop.shallow;

public class TestAccount {

	public static void main(String[] args) throws CloneNotSupportedException  {

		// Original object create kiya
		Account a1 = new Account();

		// Original object ka balance 10
		a1.balance = 10;

		// clone() se a1 ki copy banayi
		// Ab a2 ek naya object hai
		Account a2 = (Account) a1.clone();

		// Sirf clone object ka balance change kiya
		a2.balance = 20;

		// Original object ka balance print hoga
		System.out.println(a1.balance);

		// Clone object ka balance print hoga
		System.out.println(a2.balance);
	}
//ek he object ko point kara gaiii
	
	//clone method object return kar tiii haiii 
}
