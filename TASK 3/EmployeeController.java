package com.example.hpedemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping(
            path = "/",
            produces = "application/json")
    public Employees getEmployees() {
        return employeeManager.getAllEmployees();
    }

    @PostMapping(
            path = "/",
            consumes = "application/json",
            produces = "application/json")

    public ResponseEntity<Object> addEmployee(
            @RequestBody Employee employee) {

        employeeManager
                .addEmployee(employee);

        URI location
                = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        employee.getEmployee_id())
                .toUri();

        return ResponseEntity
                .created(location)
                .build();
    }

}
