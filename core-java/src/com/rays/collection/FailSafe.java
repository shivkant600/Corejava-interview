package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {
	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);

		Enumeration e = v.elements();
		// SAME AS ITERATOR 

		v.addElement(5);

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());
		}
	}
}