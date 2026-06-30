package com.rays.javaBasic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		LocalDate Bdate = LocalDate.of(2004, 06, 2);

		Period p = Period.between(Bdate, date);

		System.out.println("Age = " + p.getYears());
	}

}