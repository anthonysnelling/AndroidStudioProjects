package com.anthonysnelling.javaobjectsasmethodparameters;

import java.awt.image.BandCombineOp;

public class JavaObjectsAsMethodParameters {
    public static void main(String[] args) {
        Employer bank = new Employer();

        Employee Jenna = new Employee("Jenna", "Lassoft", 12347, "HR", "Recruiter", 4500.89);
        Employee Lance = new Employee("Lance", "K.",863405, "IT","IT/Support", 3500.59);

        bank.calculateAnnualBonus(Jenna);
        bank.calculateAnnualBonus(Lance);
        System.out.println("Details for Lance: ");
        bank.EmployeeDetails(Lance);
        System.out.println(Jenna.getFirstName() + " and " + Lance.getFirstName() + " are related? : " +  bank.areRelated(Jenna, Lance));

    }
}