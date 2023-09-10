package com.reflection.example;

import java.io.OutputStream;

public class Employee {

    public String name;
    public int id;
    public String department;
    private double salary = 1000;

    // public Employee(String name, int id, String department, double salary) {
    //     this.name = name;
    //     this.id = id;
    //     this.department = department;
    //     this.salary = salary;
    // }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }



    public Employee() {}

    public void increaseSalary() {
        salary *= 2;
    }


    public static void main(String[] args) {
    }

    // public double getSalary() {
    //     return salary;
    // }
    //
    // public void setSalary(double salary) {
    //     this.salary = salary;
    // }

    private void changeDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.println("New department is: " + newDepartment);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + salary + "]";
    }


}
