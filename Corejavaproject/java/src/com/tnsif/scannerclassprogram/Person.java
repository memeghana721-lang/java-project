package com.tnsif.scannerclassprogram;

public class Person {

    private String name;
    private int income;
    private int tax;

    // Getter and Setter Methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    // toString Method

    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", tax=" + tax + "]";
    }
}