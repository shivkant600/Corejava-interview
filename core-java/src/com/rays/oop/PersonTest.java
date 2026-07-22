package com.rays.oop;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest {

    public static void main(String[] args) throws ParseException  {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dob = sdf.parse("13-08-2002");

        Person p = new Person();

        p.setFirstName("shivkant");
        p.setLastName("choudhary");
        p.setDob(dob);
        p.setMobNo(1234567890);

        System.out.println("First Name  : " + p.getFirstName());
        System.out.println("Last Name   : " + p.getLastName());
        System.out.println("DOB         : " + sdf.format(p.getDob()));
        System.out.println("Mobile No   : " + p.getMobNo());

        System.out.println("Company Name: " + Person.COMPANY_NAME);
    }
}