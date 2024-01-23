package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {

    public static <HourlyEmployee, Department> void main(String[] args) {
        Employee mike = new SalariedEmployee("Mike", LocalDate.of(2020, 03, 05), 1000.0);
        Employee sang = new SalariedEmployee("Sang", LocalDate.of(2010, 03, 05), 2000.0);
        Employee jungus = new com.hr.personnel.HourlyEmployee("Jungus", LocalDate.of(2016, 10, 10), 10, 10.0);



    }
}