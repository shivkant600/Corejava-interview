package com.rays.string;

public class StringBufferMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Shivkant");

		System.out.println(sb.toString());

		System.out.println("Length = " + sb.length());

		System.out.println("Insert = " + sb.insert(0, "Hii"));

		System.out.println("Delete = " + sb.delete(0, 2));

		System.out.println("IndexOf = " + sb.indexOf("t"));

		System.out.println("CharAt = " + sb.charAt(0));

		System.out.println("Reverse = " + sb.reverse());

		System.out.println("Replace = " + sb.replace(0, 2, "w"));

		System.out.println("Append = " + sb.append("Choudhary"));

		System.out.println("Capacity = " + sb.capacity());

	}
}