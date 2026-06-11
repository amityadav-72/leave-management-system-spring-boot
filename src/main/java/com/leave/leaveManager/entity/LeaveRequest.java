package com.leave.leaveManager.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

@Entity
@Table(name="LeaveRequest")
public class LeaveRequest{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long request_id;
    private long emp_id;
    private long leave_id;
    private LocalDate start_date;
    private LocalDate end_date;
    private String reasons;
    private String status;
    private long days;
    private LocalDate applied_date;
    private long approved_by_manager_id;
    private LocalDateTime approval_date;
    private String manager_comments;


}