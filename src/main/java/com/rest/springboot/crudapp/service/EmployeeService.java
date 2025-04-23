package com.rest.springboot.crudapp.service;

import com.rest.springboot.crudapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();
}
