package com.leave.leaveManager.controller;

import com.leave.leaveManager.entity.LeaveRequest;
import com.leave.leaveManager.service.LeaveRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leave-requests")
public class LeaveRequestController {

    private final LeaveRequestService leaveRequestService;

    public LeaveRequestController(LeaveRequestService leaveRequestService) {
        this.leaveRequestService = leaveRequestService;
    }

    @PostMapping
    public LeaveRequest saveLeaveRequest(
            @RequestBody LeaveRequest leaveRequest) {
        return leaveRequestService.saveLeaveRequest(leaveRequest);
    }

    @GetMapping
    public List<LeaveRequest> getAllLeaveRequests() {
        return leaveRequestService.getAllLeaveRequests();
    }

    @PutMapping("/{id}/reject")
    public LeaveRequest rejectLeave(
            @PathVariable Long id) {

        return leaveRequestService.rejectLeave(id);
    }

    @GetMapping("/{id}")
    public LeaveRequest getLeaveRequestById(
            @PathVariable Long id) {

        return leaveRequestService.getLeaveRequestById(id);
    }
}