package com.rays.oop.withconstructor;

public class Circle extends Shape{

	private double redius;

	private static final double PI = 3.14;

	public Circle(double redius) {
		this.redius = redius;
	}

	public double area() {
		double cArea = PI * redius * redius;
		System.out.println("Area of Circle = " + cArea);
		return cArea;
	}
}