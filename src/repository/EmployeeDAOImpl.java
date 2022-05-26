package com.example.restapidemo.repository;

import com.example.restapidemo.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findByAgeLargerThan(int age) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Employee> theQuery = currentSession.createQuery("from Employee where employee_age > :theAge");
        theQuery.setParameter(theAge,age);
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public List<Employee> groupByAge() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> theQuery = currentSession.createQuery("employee_age, employee_name from Employee group by employee_age order by employee_age asc");
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }
}
