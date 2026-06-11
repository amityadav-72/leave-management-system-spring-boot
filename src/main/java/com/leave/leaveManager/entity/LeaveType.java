package com.leave.leaveManager.entity;

import jakarta.persistence.*;

@Entity
@Table(name="LeaveType")
 public class LeaveType{

    @Id
    private int leave_id;
    private String leave_name;
    private String leave_description;

}