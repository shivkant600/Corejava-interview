package com.rays.javaBasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarModifi {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Calendar c = Calendar.getInstance();

		Date d = sdf.parse("23-06-2026");

		c.setTime(d);

		for (int i = 1; i <= 12; i++) {

			System.out.println(sdf.format(c.getTime()));

			c.add(Calendar.DATE, 30);
		}

	}
}