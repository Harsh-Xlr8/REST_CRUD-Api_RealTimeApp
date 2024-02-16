package com.harshcode.springboot.cruddemo.service;

import com.harshcode.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
}
