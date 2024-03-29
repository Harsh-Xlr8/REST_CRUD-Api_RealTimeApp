package com.harshcode.springboot.cruddemo.dao;

import com.harshcode.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDaoJpaImpl implements EmployeeDAO{

    // define a field for entityManager

      private EntityManager entityManager;

    // set up constructor Injection
@Autowired
      public EmployeeDaoJpaImpl(EntityManager theEntityManager){
          entityManager = theEntityManager;
      }

    @Override
    public List<Employee> findAll() {

        // create a query

        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee",Employee.class);

        // execute the query and get result list.

        List<Employee> employees = theQuery.getResultList();

        //return result

        return employees;
    }
}
