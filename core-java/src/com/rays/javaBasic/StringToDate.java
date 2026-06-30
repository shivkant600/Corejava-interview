package com.rays.javaBasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StringToDate {

	public static void main(String[] args) throws ParseException {
		
		String sDate = "01-01-2026";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sdf.parse(sDate);
		System.out.println(d);
		
	}
	
	
}