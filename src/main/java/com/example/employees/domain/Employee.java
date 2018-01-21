package com.example.employees.domain;

public class Employee {

    private long id;

    private String name;

    private String lastName;

    private double salary;

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
