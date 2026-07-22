package com.rays.oop.methodreturntype;

public class Circle extends Shape {

	private double radius;

	public static final double PI = 3.14;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {

		double cArea = PI * radius * radius;
		System.out.println("Area Of Circle = " + cArea);
		return cArea;

	}
}