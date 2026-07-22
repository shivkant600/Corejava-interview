package com.rays.exception;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setBalance(1000);

		a.deposit(500);

		try {

			a.withdrawl(45500);

		} catch (InsufficientBalance e) {
			System.out.println(e);
		}
		
	}
}