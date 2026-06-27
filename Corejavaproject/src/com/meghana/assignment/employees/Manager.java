package com.meghana.assignment.employees;

public class Manager extends Employee {

    // Additional attribute
    private String department;

    // Default Constructor
    public Manager() {

    }

    // Parameterized Constructor
    public Manager(String name, int employeeId, double salary, String department) {

        super(name, employeeId, salary);
        this.department = department;
    }

    // Getter
    public String getDepartment() {
        return department;
    }

    // Setter
    public void setDepartment(String department) {
        this.department = department;
    }

    // Display Method
    public void displayManager() {

        displayEmployee();
        System.out.println("Department    : " + department);
    }
}