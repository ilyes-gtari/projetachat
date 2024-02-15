package com.example.crudspring.controller;

import com.example.crudspring.models.Employee;
import com.example.crudspring.repository.EmployeeRepository;
import com.example.crudspring.services.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class EmployeeControllerTest {

    @Mock
    private EmployeeRepository employeeRepository;
    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L, "John", "Doe", "john@example.com"));
        employees.add(new Employee(2L, "Jane", "Doe", "jane@example.com"));
        when(employeeRepository.findAll()).thenReturn(employees);
        ResponseEntity<List<Employee>> responseEntity = employeeController.getAllEmployees();
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(employees, responseEntity.getBody());
    }
    @Test
    void createEmployee() {
    }

    @Test
    void getEmployeeById() {
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void deleteEmployee() {
    }
}