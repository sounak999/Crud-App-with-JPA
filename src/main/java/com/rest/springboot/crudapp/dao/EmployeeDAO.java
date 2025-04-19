package com.rest.springboot.crudapp.dao;

import com.rest.springboot.crudapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
