package com.hr.personnel;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    @Test
    public void computeMonthlyCompensation() {
        Employee jungus = new com.hr.personnel.HourlyEmployee("Jungus", LocalDate.of(2016, 10, 10), 10, 10.0);
        Assertions.assertThat(jungus.getEmployeeInfo().contains("100.0"));
    }
}