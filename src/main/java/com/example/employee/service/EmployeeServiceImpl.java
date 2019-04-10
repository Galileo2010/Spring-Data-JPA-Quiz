package com.example.employee.service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    //也可以用@Resource 暂时不懂，骆小俊 2019-4-10 11:56:29
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }
}
