package com.example.employee.controller;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController{

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("home")
    public String homePage() {
        return "Home Page";
    }
    @GetMapping(value = "home/getId={id}")
    public Employee employeeFind(@PathVariable("id") int id) {
       return employeeService.getEmployeeById(id);
    }
}