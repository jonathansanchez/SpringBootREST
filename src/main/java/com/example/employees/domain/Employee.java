package com.example.employees.domain;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private double salary;

    public Employee() {}

    public Employee(long id, String name, String lastName, double salary) {
        this.id       = id;
        this.name     = name;
        this.lastName = lastName;
        this.salary   = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", lastname=" + lastName + ", salary=" + salary + "]";
    }
}
