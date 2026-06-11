package com.leave.leaveManager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="MANAGER")
    public class Manager {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long manager_id;
        private String manager_name;
        private String location;
        private String Status;
        private long total_approved_leaves;
        private LocalDateTime created_at;
        private LocalDateTime updated_at;
    }

