package com.rest.springboot.crudapp.service;

import com.rest.springboot.crudapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int employeeId);

    Employee save(Employee employee);

    void deleteById(int employeeId);
}
