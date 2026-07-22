package com.rays.oop.withconstructor;

public class TestShape {
	public static void main(String[] args) {

		Shape s[] = new Shape[3];

		//s[0] = new Rectangle(3, 4);

		
		s[0] =  new Rectangle(5, 4);
		s[1] = new Circle(5);

		s[2] = new Triangle(5, 6);

		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}
}