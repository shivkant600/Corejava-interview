package com.rays.oop.withoutconstructor;

public class Circle extends Shape{

	private double redius;
	
	private static final double PI = 3.14;

	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}
	
	public double area() {

		double cArea = PI*redius*redius;
		System.out.println("Area of Circle = "+cArea);
		return cArea;
	}
}