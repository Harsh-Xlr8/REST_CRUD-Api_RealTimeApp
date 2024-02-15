package com.harshcode.springboot.cruddemo.rest;

import com.harshcode.springboot.cruddemo.dao.EmployeeDAO;
import com.harshcode.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class employeeRestController{

    private EmployeeDAO employeeDAO;

    public employeeRestController(EmployeeDAO theemployeedao){
        employeeDAO = theemployeedao;
    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
     return employeeDAO.findAll();
    }

}
