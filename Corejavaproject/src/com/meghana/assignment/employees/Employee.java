package com.meghana.assignment.employees;

public class Employee {

    // Private attributes
    private String name;
    private int employeeId;
    private double salary;

    // Default Constructor
    public Employee() {

    }

    // Parameterized Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter Methods

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display Method

    public void displayEmployee() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Salary        : " + salary);
    }
}