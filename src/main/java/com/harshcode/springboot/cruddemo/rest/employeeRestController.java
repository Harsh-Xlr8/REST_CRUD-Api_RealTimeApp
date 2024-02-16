package com.harshcode.springboot.cruddemo.rest;

import com.harshcode.springboot.cruddemo.dao.EmployeeDAO;
import com.harshcode.springboot.cruddemo.entity.Employee;
import com.harshcode.springboot.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class employeeRestController{

    private EmployeeService employeeService;

    public employeeRestController(EmployeeService theemployeeservice){
        employeeService = theemployeeservice;
    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
     return employeeService.findAll();
    }

}
