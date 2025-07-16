package com.example.employeeapi.service;

import com.example.employeeapi.dao.EmployeeDao;
import com.example.employeeapi.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeDao dao;
    public EmployeeService(EmployeeDao dao) { this.dao = dao; }
    public Employee updateEmployee(Employee e){ return dao.updateEmployee(e); }
    public java.util.List<Employee> getAll(){ return dao.getAll(); }
}