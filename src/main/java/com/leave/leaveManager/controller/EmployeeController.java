package com.leave.leaveManager.controller;

import com.leave.leaveManager.entity.Employee;
import com.leave.leaveManager.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee)
    {
        System.out.println(employee);
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeId(@PathVariable long id){
        return employeeService.getEmployeeId(id);
    }

    @PutMapping("/{id}")
        public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employee){
            return employeeService.updateEmployee(id, employee);

        }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }

}