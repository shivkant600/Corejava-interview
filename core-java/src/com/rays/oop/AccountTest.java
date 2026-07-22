package com.rays.oop;

public class AccountTest {

	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(100);
		a.deposit(100);
		a.withdrawal(50);
	}
}