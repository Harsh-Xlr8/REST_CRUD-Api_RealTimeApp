package com.harshcode.springboot.cruddemo.service;

import com.harshcode.springboot.cruddemo.dao.EmployeeDAO;
import com.harshcode.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDao){
        employeeDAO = theEmployeeDao;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
