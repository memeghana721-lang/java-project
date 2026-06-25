package com.tnsif.scannerclassprogram;

import java.util.Scanner;

public class Personexec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the person name:");
        String name = sc.nextLine();

        System.out.println("Enter the income:");
        int income = sc.nextInt();

        Person pp = new Person(); // Object
        pp.setName(name);
        pp.setIncome(income);

        Taxcalculation t = new Taxcalculation(); // Object
        t.calculatetax(pp);

        System.out.println("After tax calculation:");
        System.out.println(pp);

        sc.close();
    }
}