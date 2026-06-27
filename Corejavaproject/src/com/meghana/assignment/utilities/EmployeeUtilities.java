package com.meghana.assignment.utilities;

import com.meghana.assignment.employees.Developer;
import com.meghana.assignment.employees.Manager;

/**
 * Utility class for Employee operations.
 * Demonstrates usage of public getter methods
 * to access private data.
 */
public class EmployeeUtilities {

    /**
     * Displays Manager details.
     * @param manager Manager object
     */
    public void displayManager(Manager manager) {

        System.out.println("----- Manager Details -----");
        System.out.println("Name : " + manager.getName());
        System.out.println("ID : " + manager.getEmployeeId());
        System.out.println("Salary : " + manager.getSalary());
        System.out.println("Department : " + manager.getDepartment());
    }

    /**
     * Displays Developer details.
     * @param developer Developer object
     */
    public void displayDeveloper(Developer developer) {

        System.out.println("----- Developer Details -----");
        System.out.println("Name : " + developer.getName());
        System.out.println("ID : " + developer.getEmployeeId());
        System.out.println("Salary : " + developer.getSalary());
        System.out.println("Programming Language : "
                + developer.getProgrammingLanguage());
    }

    /**
     * Increases salary.
     * @param salary current salary
     * @return updated salary
     */
    public double incrementSalary(double salary) {

        return salary + 5000;
    }
}