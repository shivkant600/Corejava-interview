package com.rays.exception;

public class TestStringIndexOutOfBound {

	public static void main(String[] args) {

		String s = "shivkant";
		String a[] = { "a", "b" };

		try {

			//System.out.println(10 / 0);
			System.out.println(a[3]);
			System.out.println(s.charAt(8));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			//System.exit(0);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);

		} finally {

			System.out.println("Final");
		}

	}
}