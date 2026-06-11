package com.rays.string;

public class Capacity {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("shivkant");
		
		System.out.println("Length = "+ sb.length());
		System.out.println("Capacity = "+ sb.capacity());
		
		System.out.println("Append = "+ sb.append("choudhary"));
		System.out.println("Length = "+ sb.length());
		System.out.println("Capacity = "+ sb.capacity());
		
		System.out.println("Append = "+ sb.append("narshingpur"));
		
		System.out.println("Append = "+ sb.append("narshingpur"));
		System.out.println("Append = "+ sb.append("narshingpur"));
		System.out.println("Append = "+ sb.append("narshingpur"));
		System.out.println("Append = "+ sb.append("narshingpur"));
		System.out.println("Append = "+ sb.append("narshingpur"));
		System.out.println("Length = "+ sb.length());
		System.out.println("Capacity = "+ sb.capacity());
		System.out.println("Capacity = "+ sb.capacity());
	}
}