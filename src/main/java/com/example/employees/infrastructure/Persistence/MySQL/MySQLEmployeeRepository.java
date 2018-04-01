package com.example.employees.infrastructure.Persistence.MySQL;

import com.example.employees.domain.Employee;
import com.example.employees.domain.EmployeeRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class MySQLEmployeeRepository implements EmployeeRepository {
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(long id) {
        return null;
    }
}
