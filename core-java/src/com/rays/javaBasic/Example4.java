package com.rays.javaBasic;

import java.util.Calendar;

public class Example4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Object created using factory method: " + calendar.getTime());
    }
}