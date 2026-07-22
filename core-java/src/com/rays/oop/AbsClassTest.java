package com.rays.oop;

public class AbsClassTest extends AbstractClass {

	@Override
	public void show() {
		System.out.println("Show Method");
	}

	public AbsClassTest(String name) {
		super(name);
		System.out.println(name);
	}

	public static void main(String[] args) {

		AbsClassTest t = new AbsClassTest("Gautam");

		t.simple();
		t.show();

		AbstractClass.simple();
	}
}