package com.rays.oop.withoutconstructor;

public class Triangle extends Shape{

	private double base;
	
	private double height;

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {

		double tArea = (base*height)/2;
		System.out.println("Area of Triangle = "+ tArea);
		return tArea;
	}
}