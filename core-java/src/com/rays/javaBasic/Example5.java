package com.rays.javaBasic;

import java.lang.reflect.Constructor;

public class Example5 {
    public void display() {
        System.out.println("Object created using Constructor.newInstance()");
    }

    public static void main(String[] args) {
        try {
            Constructor<Example5> constructor = Example5.class.getDeclaredConstructor();
            Example5 example = constructor.newInstance();
            example.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}