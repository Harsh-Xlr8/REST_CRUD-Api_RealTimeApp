package com.harshcode.springboot.cruddemo.dao;

import com.harshcode.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
