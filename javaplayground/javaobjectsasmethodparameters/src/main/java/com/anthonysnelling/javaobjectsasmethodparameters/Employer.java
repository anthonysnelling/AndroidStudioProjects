package com.anthonysnelling.javaobjectsasmethodparameters;

public class Employer {
    private String name;
    private String location;

    public Employer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Employer(){
    }

    public void EmployeeDetails(Employee employee){
        System.out.println("ID: " + employee.getIdNumber()
        + "Name: " + employee.getFirstName() + " " + employee.getLastName()
        + " Deparment: " + employee.getDepartment()
        + " Positon: " + employee.getPosition()
        + " Monthly Salary: " + employee.getMonthlySalary());
    }

    public void calculateAnnualBonus(Employee employee){
        double annualBonus = ((employee.getMonthlySalary() * 0.15) * 11 );
        System.out.println("Annual Bonus for: " + employee.getFirstName() + " is " + annualBonus);
    }

    public Boolean areRelated(Employee employee1, Employee employee2){
        return employee1.getLastName() == employee2.getLastName();
    }
}
