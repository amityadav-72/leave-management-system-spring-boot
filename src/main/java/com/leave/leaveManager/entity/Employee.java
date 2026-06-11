package com.leave.leaveManager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "EMPLOYEE")
    public class Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long emp_id;

    private String name;
    private String location;
    private String designation;
    private  long manager_id;
    private String status;
    private long paid_leave_balance;
    private long casual_leave_balance;
    private LocalDate joining_date;
    private LocalTime created_at;
    private LocalTime Updated_at;


}
