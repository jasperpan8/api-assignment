package com.example.restapidemo.entity;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employee_name")
    private String employee_name;

    @Column(name="employee_salary")
    private long employee_salary;

    @Column(name="employee_age")
    private int age;

    @Column(name = "profile_image")
    private String profile_image;

    public Employee() {
    }

    public Employee(String employee_name, long employee_salary, int age, String profile_image) {
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.age = age;
        this.profile_image = profile_image;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(long employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_salary=" + employee_salary +
                ", age=" + age +
                ", profile_image='" + profile_image + '\'' +
                '}';
    }
}
