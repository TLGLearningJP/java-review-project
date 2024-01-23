package com.hr.personnel.client;

import com.hr.personnel.Employee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", LocalDate.of(2000, 05, 16));
        String employeeInfo = employee.getEmployeeInfo();
        System.out.println(employeeInfo);

        String work = employee.work();
        System.out.println(work);
    }
}