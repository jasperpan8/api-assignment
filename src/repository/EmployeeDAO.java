package com.example.restapidemo.repository;

import com.example.restapidemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findByAgeLargerThan(int age);
    public List<Employee> groupByAge();

}
