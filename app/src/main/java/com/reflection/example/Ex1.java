package com.reflection.example;

import java.lang.reflect.Field;

public class Ex1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
        Class employeeClass = Employee.class;
        // Class employeeClass2 = Class.forName("com.reflection.example.Employee");
        // Employee emp = new Employee();
        // Class employeeClass3 = emp.getClass();
        // System.out.println(employeeClass);
        // System.out.println(employeeClass3);
        // System.out.println(employeeClass2);
        
        Field employeeField = employeeClass.getField("id");
        System.out.println("Type of id field = " + employeeField.getType());
        System.out.println("*****");

        Field[] fields = employeeClass.getFields();

        for(Field field : fields) {
            System.out.println("Type of %s = %s".formatted(field.getName(), field.getType()) );
        }
        System.out.println("*****");
        Field[] declaredFields = employeeClass.getDeclaredFields();
        for(Field field : declaredFields) {
            System.out.println("Type of %s = %s".formatted(field.getName(), field.getType()));
        }
    }
}
