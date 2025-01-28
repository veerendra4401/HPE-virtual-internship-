package com.example.hpedemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HpeDemoApplicationTests {
    @Mock
    private EmployeeManager employeeManager;

    @BeforeEach
    void setUp(){
        employeeManager = new EmployeeManager();
    }

    @Test
    void createEmployeeManager() {
        EmployeeManager employeeManager1 = new EmployeeManager();
        assertEquals(3, employeeManager1.getAllEmployees().getEmployeeList().size());
    }

    @Test
    void addingNewEmployeeSucessfully() {
        employeeManager.addEmployee(new Employee("djones3", "Daria", "Jones", "dariajones@gmail.com", "Software engineer"));
        assertEquals(4, employeeManager.getAllEmployees().getEmployeeList().size());
        assertEquals("Daria", employeeManager.getAllEmployees().getEmployeeList().get(3).getFirst_name());
    }

    @Test
    void testThrowsWhenTryingToGetNonExistingRecord() {
        assertThrows(Exception.class,
                () -> employeeManager.getAllEmployees().getEmployeeList().get(4));
    }
}
