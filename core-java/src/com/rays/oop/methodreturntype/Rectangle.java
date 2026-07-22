package com.rays.oop.methodreturntype;

public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		double rArea = length * width;
		System.out.println("Area of Rectangle = " + rArea);
		return rArea;
	}
}