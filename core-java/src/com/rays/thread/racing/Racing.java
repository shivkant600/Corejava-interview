package com.rays.thread.racing;

public class Racing extends Thread {

	String name = null;
	//ek baar memory mil tiii hai es liya apan nai ush ko static bana taiii haiiiii
	public static Account account = new Account();

	public Racing(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			account.deposit(name, 1000);
		}
	}
}