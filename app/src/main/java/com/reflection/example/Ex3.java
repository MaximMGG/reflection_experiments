package com.reflection.example;

import java.lang.reflect.Field;

public class Ex3 {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Employee employee = new Employee(19, "Bob", "IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        System.out.println(field.getName());

        field.setAccessible(true);
        double salary = (double) field.get(employee);
        System.out.println(salary);

        field.set(employee, 123123.1);
        System.out.println(employee);
    }
}
