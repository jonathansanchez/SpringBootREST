package com.example.employees.domain;

import java.util.List;

public interface EmployeeRepository {
    public List<Employee> findAll();

    public Employee findById(long id);
}
