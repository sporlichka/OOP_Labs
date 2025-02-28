package com.example.domain;

import java.text.NumberFormat;

public class Director extends Manager{

    private double budget;

    public Director(int empId, String name, String ssn, double salary, String deptName, double budget, Employee[] staff) {
        super(empId, name, ssn, salary, deptName, staff);
        this.budget = budget;
    }

    public double getBudget(){
        return budget;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBudget:         " + NumberFormat.getCurrencyInstance().format(getBudget());
    }
}
