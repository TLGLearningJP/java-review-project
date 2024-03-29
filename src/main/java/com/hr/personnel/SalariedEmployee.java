package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee() {

    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }
    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary){
        super(name, hireDate);
        setMonthlySalary(monthlySalary);
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


}