package com.zaurtregulov.spring.mvc_hibernate_aop.sevice;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
}
