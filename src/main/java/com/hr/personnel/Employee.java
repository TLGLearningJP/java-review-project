package com.hr.personnel;

import java.time.LocalDate;

abstract public class Employee {
    private String name;
    private LocalDate hireDate;

    abstract public double computeMonthlyCompensation();

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public Employee() {

    }

    public String getEmployeeInfo() {
        return "name = " + name + ", hireDate = " + hireDate;
    }

    public String work() {
        return name + " worked";
    }
}