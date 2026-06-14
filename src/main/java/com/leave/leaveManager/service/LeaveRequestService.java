package com.leave.leaveManager.service;

import com.leave.leaveManager.entity.LeaveRequest;
import com.leave.leaveManager.exception.ResourceNotFoundException;
import com.leave.leaveManager.repository.LeaveRequestRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LeaveRequestService {

    private final LeaveRequestRepository leaveRequestRepository;

    public LeaveRequestService(LeaveRequestRepository leaveRequestRepository) {
        this.leaveRequestRepository = leaveRequestRepository;
    }

    public LeaveRequest saveLeaveRequest(LeaveRequest leaveRequest) {
        return leaveRequestRepository.save(leaveRequest);
    }

    public List<LeaveRequest> getAllLeaveRequests() {
        return leaveRequestRepository.findAll();
    }

    public LeaveRequest approveLeave(Long requestId) {

        LeaveRequest leaveRequest =
                leaveRequestRepository.findById(requestId)
                        .orElse(null);

        if (leaveRequest == null) {
            return null;
        }

        leaveRequest.setStatus("APPROVED");
        leaveRequest.setApprovedByManagerId(101L);
        leaveRequest.setApprovalDate(LocalDateTime.now());
        leaveRequest.setManagerComments("Approved");

        return leaveRequestRepository.save(leaveRequest);
    }

    public LeaveRequest rejectLeave(Long requestId) {

        LeaveRequest leaveRequest =
                leaveRequestRepository.findById(requestId)
                        .orElse(null);

        if (leaveRequest == null) {
            return null;
        }

        leaveRequest.setStatus("REJECTED");
        leaveRequest.setApprovedByManagerId(101L);
        leaveRequest.setApprovalDate(LocalDateTime.now());
        leaveRequest.setManagerComments("Rejected");

        return leaveRequestRepository.save(leaveRequest);
    }

    public LeaveRequest getLeaveRequestById(Long id) {
        return leaveRequestRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Leave Request Not Found"));

    }

}