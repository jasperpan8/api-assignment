package com.example.restapidemo.service;

import com.example.restapidemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findByAgeLargerThan(int age);
    public List<Employee> groupByAge();

}
