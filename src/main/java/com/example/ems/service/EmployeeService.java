package com.example.ems.service;

import com.example.ems.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    public String getMessage() {
        return "Hello from Employee Service!";
    }

   public List<Employee> getAllEmployees() {

       Employee employee1 = new Employee(
               1L,
               "John",
               "john@gmail.com",
               "IT"
       );

       Employee employee2 = new Employee(
               2L,
               "Sarah",
               "sarah@gmail.com",
               "HR"
       );

       Employee employee3 = new Employee(
               3L,
               "David",
               "david@gmail.com",
               "Finance"
       );

       return Arrays.asList(employee1, employee2, employee3);
   }
}