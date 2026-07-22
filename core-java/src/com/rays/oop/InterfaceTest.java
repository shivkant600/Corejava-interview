package com.rays.oop;

public class InterfaceTest implements MakeInterface {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		InterfaceTest t =new InterfaceTest();
		
		System.out.println(t.sum(10,20));
		
		MakeInterface.staticMethod();
		
		t.defaulfMethod();
	}
}