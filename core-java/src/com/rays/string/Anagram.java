package com.rays.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "jar";
		String s2 = "raj";

		char[] ar1 = s1.toCharArray();    //ar1 = ['j','a','r']
				
		char[] ar2 = s2.toCharArray();   //ar2 = ['r','a','j']

		System.out.println(ar1);

		Arrays.sort(ar1);
		Arrays.sort(ar2);

		System.out.println(ar1);
		//System.out.println(ar2);


		if (Arrays.equals(ar1, ar2)) {
			System.out.println(s1 + " " + s2 + " Is Anagram");
		} else {
			System.out.println(s1 + " " + s2 + " Is Not Anagram");
		}
	}
}