package com.example.employee.service;
import com.example.employee.entity.Employee;
// 接口不需要@Service 骆小俊 2019-4-10 12:10:21
public interface EmployeeService {
    public Employee getEmployeeById(int id);
}
