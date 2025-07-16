package com.example.employeeapi.controller;

import com.example.employeeapi.model.Employee;
import com.example.employeeapi.service.EmployeeService;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService svc;
    public EmployeeController(EmployeeService svc){ this.svc = svc; }
    @PutMapping
    public Employee updateEmployee(@RequestBody @Valid Employee e) {
        return svc.updateEmployee(e);
    }
    @GetMapping
    public java.util.List<Employee> getAll(){ return svc.getAll(); }
}
