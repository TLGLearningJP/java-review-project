package com.hr.personnel;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    @Test
    public void computeMonthlyCompensation() {
        Employee mike = new SalariedEmployee("Mike", LocalDate.of(2020, 03, 05), 1000.0);
        Assertions.assertThat(mike.getEmployeeInfo().contains("1000.0"));
    }
}