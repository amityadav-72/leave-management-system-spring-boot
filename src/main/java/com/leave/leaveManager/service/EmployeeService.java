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

    public Employee getEmployeeId(long id){
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee updateEmployee(long id , Employee updateEmployee){
        Employee existingEmployee = employeeRepository.findById(id).orElse(null);

        if(existingEmployee == null){
            return null;
        }

        existingEmployee.setName(updateEmployee.getName());
        existingEmployee.setLocation(updateEmployee.getLocation());
        existingEmployee.setDesignation(updateEmployee.getDesignation());
        existingEmployee.setManagerId(updateEmployee.getManagerId());
        existingEmployee.setStatus(updateEmployee.getStatus());
        existingEmployee.setPaidLeaveBalance(updateEmployee.getPaidLeaveBalance());
        existingEmployee.setCasualLeaveBalance(updateEmployee.getCasualLeaveBalance());
        existingEmployee.setJoiningDate(updateEmployee.getJoiningDate());
        existingEmployee.setUpdatedAt(updateEmployee.getUpdatedAt());
        existingEmployee.setCreatedAt(updateEmployee.getCreatedAt());

        return employeeRepository.save(existingEmployee);

    }

    public void deleteEmployee(long id){
        employeeRepository.deleteById(id);
    }
}