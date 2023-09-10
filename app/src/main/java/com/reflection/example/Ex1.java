package com.reflection.example;

public class Ex1 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class employeeClass = Employee.class;
        Class employeeClass2 = Class.forName("com.reflection.example.Employee");
        Employee emp = new Employee();
        Class employeeClass3 = emp.getClass();
        System.out.println(employeeClass);
        System.out.println(employeeClass2);
        System.out.println(employeeClass3);
    }
}
