package com.hr.personnel;

import java.util.Arrays;

public class Department {
    private String name;
    private String location;
    private final Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public double computeDepartmentMonthlyTotalCompensation() {
        return 0.0;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numberOfEmployeesWhoWorked = 0;
//        for(int i = 0; i < currentIndex; i++) {
//            if (employees[i].work().contains("worked")) {
//                numberOfEmployeesWhoWorked++;
//            }
//        }

        long worked = Arrays.stream(employees)
                .filter(employee -> employee != null
                        && employee.getEmployeeInfo().contains("worked"))
                .count();
        numberOfEmployeesWhoWorked = (int) worked;

        return numberOfEmployeesWhoWorked;
    }
}
