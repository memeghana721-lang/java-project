package com.meghana.assignment.employees;

public class Developer extends Employee {

    // Additional attribute
    private String programmingLanguage;

    // Default Constructor
    public Developer() {

    }

    // Parameterized Constructor
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {

        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Getter
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Setter
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    // Display Method
    public void displayDeveloper() {

        displayEmployee();
        System.out.println("Programming Language : " + programmingLanguage);
    }
}