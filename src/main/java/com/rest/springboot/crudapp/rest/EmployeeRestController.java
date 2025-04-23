package com.rest.springboot.crudapp.rest;

import com.rest.springboot.crudapp.dao.EmployeeDAO;
import com.rest.springboot.crudapp.entity.Employee;
import com.rest.springboot.crudapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeDAO) {
        this.employeeService = theEmployeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
