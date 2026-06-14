package com.leave.leaveManager.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "LEAVE_REQUEST")
@Data
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;
    private Long empId;
    private Long leaveId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private String status;
    private Long days;
    private LocalDate appliedDate;
    private Long approvedByManagerId;
    private LocalDateTime approvalDate;
    private String managerComments;
}