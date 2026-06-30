package com.rays.javaBasic;

public class FirstHighest {

	public static void main(String[] args) {
		
		int[] arr = {1,5,3,4,89};
		int b = 0;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > b) {
				b = arr[i];
			}
		}
		System.out.println(b);
	}
}