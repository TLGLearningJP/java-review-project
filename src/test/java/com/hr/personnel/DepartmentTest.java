package com.hr.personnel;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {

    @Test
    public void addEmployee() {
        Department department = new Department("engineering", "Boston");
        Employee mike = new SalariedEmployee("Mike", LocalDate.of(2020, 03, 05), 1000.0);

        int currentIndexBeforeAddingNewEmployee = department.getCurrentIndex();
        department.addEmployee(mike);
        int currantIndexAfterAddingNewEmployee = department.getCurrentIndex();
        int differenceBeforeAndAfter = currantIndexAfterAddingNewEmployee - currentIndexBeforeAddingNewEmployee;
        Assertions.assertThat(differenceBeforeAndAfter).isEqualTo(1);
    }

//    @Test
//    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
//        Department department = new Department();
//        Employee mike = new Employee();
//        department.addEmployee(mike);
//        int numberOfEmployeesWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
//        Assertions.assertThat(numberOfEmployeesWhoWorked).isEqualTo(2);
//    }
}