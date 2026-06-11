package com.rays.string;

public class ReverseAtSamePlace {

	public static void main(String[] args) {

		String s = "Shivkant Choudhary";

		String[] a = s.split(" ");

//		System.out.println(a[0]);
//		System.out.println(a[1]);
		
		
		System.out.println(a.length);    //array ki length kitniii h 
		

		for (int i = 0; i < a.length; i++) {
			
			for (int j = a[i].length() - 1; j >= 0; j--) {
				
				System.out.print(a[i].charAt(j));
			}
			
			
			System.out.print(" ");
		}
		
	}
}