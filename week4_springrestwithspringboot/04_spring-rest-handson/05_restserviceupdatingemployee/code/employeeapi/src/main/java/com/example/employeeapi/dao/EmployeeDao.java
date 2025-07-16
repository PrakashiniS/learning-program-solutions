package com.example.employeeapi.dao;

import com.example.employeeapi.exception.EmployeeNotFoundException;
import com.example.employeeapi.model.Employee;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class EmployeeDao {
    private final List<Employee> employees = new ArrayList<>();
    public EmployeeDao() { /* seed default employees */ }
    public Employee updateEmployee(Employee e) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(e.getId())) {
                employees.set(i, e);
                return e;
            }
        }
        throw new EmployeeNotFoundException("Employee not found: " + e.getId());
    }
    public List<Employee> getAll() { return employees; }
}
