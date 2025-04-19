package com.rest.springboot.crudapp.dao;

import com.rest.springboot.crudapp.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDAOJpaImpl implements EmployeeDAO {

    // define field for entity manager
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManger) {
        this.entityManager = theEntityManger;
    }

    @Override
    public List<Employee> findAll() {

        // create query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from employee", Employee.class);

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        // return employees
        return employees;
    }
}
