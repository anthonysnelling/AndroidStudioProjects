package com.anthonysnelling.learnjava;

public class Employee extends Person {
    private int id;
    private double annualSalary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return getAge() + ", " + getId() + ", " + getAnnualSalary() + ", " + getLastName();
    }
}
