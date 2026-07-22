package com.rays.oop.methodreturntype;

public class Shape {

	public double area() {
		System.out.println("Shape Area Method");
		return 0;
	}

	public static Shape getShape(int i) {

		if (i == 1) {
			return new Rectangle(2, 3);
		}

		if (i == 2) {
			return new Circle(2);
		}

		if (i == 3) {
			return new Triangle(3, 3);
		}
		return new Shape();
	}
}