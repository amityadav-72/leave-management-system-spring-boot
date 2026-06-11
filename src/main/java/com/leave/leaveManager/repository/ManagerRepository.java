package com.leave.leaveManager.repository;

import com.leave.leaveManager.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long>  {
}
