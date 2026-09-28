package com.rays.thread;

public class TestWithThread {

	public static void main(String[] args) {

		WithThread t1 = new WithThread("Ajay");
		WithThread t2 = new WithThread("verma");

		t1.start();

		t2.start();

	}
}