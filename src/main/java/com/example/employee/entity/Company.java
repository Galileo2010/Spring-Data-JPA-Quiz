package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    private int id;
    private String companyName;
    private int employeesNumbers;

    public Company(){}
    public Company(int id, String companyName, int employeesNumbers){
        this.id = id;
        this.companyName = companyName;
        this.employeesNumbers = employeesNumbers;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getEmployeesNumbers() {
        return employeesNumbers;
    }
}
