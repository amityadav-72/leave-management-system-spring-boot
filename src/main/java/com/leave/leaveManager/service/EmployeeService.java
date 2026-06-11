package com.leave.leaveManager.service;

import java.util.*;
import com.leave.leaveManager.entity.Employee;
import com.leave.leaveManager.repository.EmployeeRepository;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}