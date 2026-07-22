package com.rays.oop.deep;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		
	//main object ki v cloning kar ti hai orr refrence object ki v cloning kar tiii haiii
		Customer c1 = new Customer("shivkant");

		Customer c2 = (Customer) c1.clone();

		//clone hata dai gai too dono object ki memmory same hooo jyaa gee to value same hooo jyaa giii
		c2.name = "anmol";
		c2.account.balance = 300;

		System.out.println(c1.name);
		System.out.println(c1.account.balance);

		System.out.println(c2.name);
		System.out.println(c2.account.balance);
	}
}