package com.leave.leaveManager.repository;

import com.leave.leaveManager.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends  JpaRepository<Employee, Long>{

}