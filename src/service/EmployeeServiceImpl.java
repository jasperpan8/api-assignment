package com.example.restapidemo.service;

import com.example.restapidemo.entity.Employee;
import com.example.restapidemo.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> findByAgeLargerThan(int age) {
        return employeeDAO.findByAgeLargerThan(age);
    }

    @Override
    @Transactional
    public List<Employee> groupByAge() {
        return employeeDAO.groupByAge();
    }
}
