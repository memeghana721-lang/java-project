package com.meghana.assignment.utilities;

import com.meghana.assignment.employees.Developer;
import com.meghana.assignment.employees.Manager;

public class EmployeeTest {

    public static void main(String[] args) {

        // Manager Object
        Manager manager = new Manager();

        manager.setName("Rahul");
        manager.setEmployeeId(101);
        manager.setSalary(75000);
        manager.setDepartment("Human Resources");

        System.out.println("===== Manager Details =====");
        manager.displayManager();

        System.out.println();

        // Developer Object
        Developer developer = new Developer();

        developer.setName("Priya");
        developer.setEmployeeId(102);
        developer.setSalary(65000);
        developer.setProgrammingLanguage("Java");

        System.out.println("===== Developer Details =====");
        developer.displayDeveloper();
    }
}