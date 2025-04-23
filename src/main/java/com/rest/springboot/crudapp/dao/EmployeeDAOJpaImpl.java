package com.rest.springboot.crudapp.dao;

import com.rest.springboot.crudapp.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
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
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        // return employees
        return employees;
    }

    @Override
    public Employee findById(int employeeId) {

        // get employee
        Employee employee = entityManager.find(Employee.class, employeeId);

        // return employee
        return employee;
    }

    @Override
    public Employee save(Employee employee) {

        // save the employee
        Employee dbEmployee = entityManager.merge(employee);
        
        // return the employee
        return dbEmployee;
    }

    @Override
    public void deleteById(int employeeId) {

        // get employee
        Employee employee = entityManager.find(Employee.class, employeeId);

        // delete the employee
        entityManager.remove(employee);
    }
}
