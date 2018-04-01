package com.example.employees.infrastructure.Persistence.InMemory;

import com.example.employees.domain.Employee;
import com.example.employees.domain.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service("EmployeeRepository")
public class InMemoryEmployeeRepository implements EmployeeRepository {

    private static final AtomicLong counter = new AtomicLong();

    private static List<Employee> employees;

    static {
        employees = dummyEmployees();
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public Employee findById(long id) {
        for(Employee employee : employees){
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

    private static List<Employee> dummyEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(
                new Employee(counter.incrementAndGet(), "Robin", "Jackman", 5500)
        );
        employees.add(
                new Employee(counter.incrementAndGet(), "Taylor", "Edward", 7200)
        );
        employees.add(
                new Employee(counter.incrementAndGet(), "Vivian", "Dickens", 6000)
        );
        employees.add(
                new Employee(counter.incrementAndGet(), "Harry", "Clifford", 6800)
        );
        employees.add(
                new Employee(counter.incrementAndGet(), "Eliza", "Clifford", 4750)
        );
        employees.add(
                new Employee(counter.incrementAndGet(), "Nancy", "Newman", 5100)
        );
        employees.add(
                new Employee(counter.incrementAndGet(), "Melinda", "Clifford", 8500)
        );
        employees.add(
                new Employee(counter.incrementAndGet(), "Harley", "Gilbert", 8000)
        );

        return employees;
    }
}