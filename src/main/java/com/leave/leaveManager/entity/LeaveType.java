package com.leave.leaveManager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "LEAVE_TYPE")
@Data
public class LeaveType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leaveId;
    private String leaveName;
    private String leaveDescription;
}