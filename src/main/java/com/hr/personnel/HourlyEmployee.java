package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double hoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        setHourlyRate(rate);
        setHoursWorkedPerMonth(hours);
    }

    @Override
    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }

    public double getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(double hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}