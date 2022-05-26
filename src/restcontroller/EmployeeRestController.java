package com.example.restapidemo.restcontroller;

import com.example.restapidemo.entity.Employee;
import com.example.restapidemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees/{age}")
    public ResponseEntity<List<Employee>> findByAgeLargerThan(int age){
        List<Employee> employees = employeeService.findByAgeLargerThan(age);

        if(employees == null){
            throw new RuntimeException("No one is older than this age!");
        }
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/employees/group/age")
    public ResponseEntity<List<Employee>> groupByAge(){
        return new ResponseEntity<>(employeeService.groupByAge(),HttpStatus.OK);
    }
}
