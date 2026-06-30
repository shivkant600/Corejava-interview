package com.rays.javaBasic;

public class SecondHighest {

	public static void main(String[] args) {

		int[] arr = { 5, 36, 4, 28, 1 };
		int highest = 0;
		int secondhighest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {

				secondhighest = highest;
				highest = arr[i];
			}
			if (secondhighest < arr[i] && highest > arr[i]) {
				secondhighest = arr[i];
			}
		}
		System.out.println(secondhighest);
	}

}
