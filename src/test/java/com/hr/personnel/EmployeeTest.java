package com.hr.personnel;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = new Employee("Sang", LocalDate.of(2010, 04, 05));
    }

    @Test
    public void getEmployeeInfo_should_return_valid_employee_info_given_valid_employee() {
        // call test target method
        String employeeInfo = employee.getEmployeeInfo();

        // verify if the result is what is expected (assert)
        Assert.assertEquals("name = Sang, hireDate = 2010-04-05", employeeInfo);
        Assertions.assertThat(employeeInfo).isEqualTo("name = Sang, hireDate = 2010-04-05");

        }

    @Test
    public void work() {
        String work = employee.work();

        Assert.assertEquals("Sang worked", work);
        Assertions.assertThat(work).isEqualTo("Sang worked");
    }
}