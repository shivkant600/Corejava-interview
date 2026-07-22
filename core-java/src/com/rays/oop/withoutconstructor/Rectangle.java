package com.rays.oop.withoutconstructor;

public class Rectangle extends Shape{

	private double length;
	private double width;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		double rArea = length*width;
		System.out.println("Area of Rectangle = "+rArea);
		return rArea;
	}
}