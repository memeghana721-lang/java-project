package com.tnsif.scannerclassprogram;

public class Taxcalculation {

    public void calculatetax(Person p) {

        if (p.getIncome() <= 160000) {
            p.setTax(0);
        } else if (p.getIncome() > 160000 && p.getIncome() <= 500000) {
            p.setTax((p.getIncome() * 10) / 100);
        } else {
            p.setTax((p.getIncome() * 20) / 100);
        }
    }
}