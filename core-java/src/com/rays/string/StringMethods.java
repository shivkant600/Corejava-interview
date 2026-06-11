package com.rays.string;

public class StringMethods {

	public static void main (String[] args) {
		
		String name = "shivkant";
		String str = "choudhary";
		

		
		System.out.println("String Length = "+ name.length());
		System.out.println("UpperCase = "+ name.toUpperCase());
		System.out.println("LowerCase = "+ name.toLowerCase());
		System.out.println("StartWith = "+ name.startsWith("s"));
		System.out.println("EndWith = "+ name.endsWith("t"));
		System.out.println("CharAt = "+ name.charAt(0));
		System.out.println("IndexOf = "+ name.indexOf("v"));
		System.out.println("LastIndexOf = "+ name.lastIndexOf("t"));
		System.out.println("SubString = "+ name.substring(1));
    	System.out.println(name.substring(0, 1));
		System.out.println("Trim = "+ name.trim());
		System.out.println("Concat = "+ name.concat(str));
		System.out.println("Concat = "+ str.concat(name));
		System.out.println("Replace = "+ name.replace("shivkant", "Rohit"));
		

	}
}