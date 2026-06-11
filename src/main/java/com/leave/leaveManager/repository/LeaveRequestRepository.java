package com.leave.leaveManager.repository;

import com.leave.leaveManager.entity.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long>{
}