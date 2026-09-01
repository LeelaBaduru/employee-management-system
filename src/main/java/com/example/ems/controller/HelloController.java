package com.example.ems.controller;

import com.example.ems.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final EmployeeService employeeService;

    public HelloController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        // return "Hello, Welcome to Employee Management System!";
        return employeeService.getMessage();

    }
}
