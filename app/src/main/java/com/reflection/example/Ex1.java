package com.reflection.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException {
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
        System.out.println("******************");

        Method method1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method : " + 
                method1.getReturnType() + ", parametr types = " + 
                Arrays.toString(method1.getParameterTypes()));

        Method method2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method : " + 
                method2.getReturnType() + ", parametr types = " + 
                Arrays.toString(method2.getParameterTypes()));

        System.out.println("***************");

        Method[] methods = employeeClass.getMethods();
        for(Method method : methods) {
            System.out.println("Name of method : %s, Return type of method : %s, parameter : %s"
                    .formatted(method.getName(), method.getReturnType(), 
                        Arrays.toString(method.getParameterTypes())));
        }

        System.out.println("********");

        Method[] methodAll = employeeClass.getDeclaredMethods();
        for(Method method : methodAll) {
            System.out.println("Name of method : %s, Return type of method : %s, parameter : %s"
                    .formatted(method.getName(), method.getReturnType(), 
                        Arrays.toString(method.getParameterTypes())));
        }
        System.out.println("********");
        Method[] methodAll2 = employeeClass.getDeclaredMethods();
        for(Method method : methodAll) {
            if (Modifier.isPublic(method.getModifiers())) {
            System.out.println("Name of method : %s, Return type of method : %s, parameter : %s"
                    .formatted(method.getName(), method.getReturnType(), 
                        Arrays.toString(method.getParameterTypes())));
            }
        }
        System.out.println("********");
        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount() + 
                " prameters, their types are: " + 
                Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("********");
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() + 
                " prameters, their types are: " + 
                Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("********");

        Constructor[] constructors = employeeClass.getConstructors();
        Arrays.stream(constructors)
                    .forEach(x -> System.out.println(
                        "Constructor has %d parameters, their types are : %s"
                        .formatted(x.getParameterCount(), Arrays.toString(x.getParameterTypes()))));
    }
}
