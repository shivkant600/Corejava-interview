package com.rays.oop.methodreturntype;

public class TestShape {

	public static void main(String[] args) {

		Shape s[] = new Shape[3];

		s[0] = Shape.getShape(1);

		s[1] = Shape.getShape(2);

		s[2] = Shape.getShape(3);

		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}
}