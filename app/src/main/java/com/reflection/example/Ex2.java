package com.reflection.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class employeeClass = Employee.class;
        // Object newInstance = (Employee) employeeClass.newInstance();
        // System.out.println(newInstance);

        Constructor<Employee> constructor1 = employeeClass.getConstructor();

        Employee newInstance = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);

        Object obj2 = constructor2.newInstance(5, "Aur", "ww");

        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 234.5);
        

        System.out.println(obj2);


    }
}
