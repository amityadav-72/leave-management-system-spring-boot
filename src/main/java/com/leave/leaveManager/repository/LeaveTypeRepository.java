package com.leave.leaveManager.repository;

import com.leave.leaveManager.entity.LeaveType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveTypeRepository extends JpaRepository<LeaveType, Long>{
}