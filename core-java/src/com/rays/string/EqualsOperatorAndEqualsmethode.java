package com.rays.string;

public class EqualsOperatorAndEqualsmethode {

	public static void main(String[] args) {

		String s1 = "SUNRAYS";
		String s2 = "SUNRAYS";

		String s3 = new String("SUNRAYS");
		String s4 = new String("SUNRAYS");

		System.out.println(s1 == s2);
		
		
		//  == refrence check kar taa h   mtb string haiii yaa object dono same hona chaiyeee
		System.out.println(s1 == s3);

		System.out.println(s3.equals(s4));
	//	.equals value check kar taa h
		
		System.out.println(s3.equals(s1));
	}
}