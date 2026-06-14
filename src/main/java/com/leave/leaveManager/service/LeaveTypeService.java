package com.leave.leaveManager.service;

import java.util.*;
import com.leave.leaveManager.entity.LeaveType;
import com.leave.leaveManager.repository.LeaveTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class LeaveTypeService{
    private final LeaveTypeRepository leaveTypeRepository;

    public LeaveTypeService(LeaveTypeRepository leaveTypeRepository){
        this.leaveTypeRepository=leaveTypeRepository;
    }

    public LeaveType saveLeaveType(LeaveType leaveType) {
        return leaveTypeRepository.save(leaveType);
    }

    public List<LeaveType> getAllLeaveTypes() {
        return leaveTypeRepository.findAll();
    }

}