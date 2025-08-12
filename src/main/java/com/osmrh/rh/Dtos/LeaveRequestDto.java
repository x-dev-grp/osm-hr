package com.osmrh.rh.Dtos;

import com.osmrh.rh.enums.LeaveStatus;
import com.osmrh.rh.enums.LeaveType;
import com.osmrh.rh.model.LeaveRequest;
import com.xdev.xdevbase.dtos.BaseDto;
import com.xdev.xdevbase.entities.BaseEntity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public class LeaveRequestDto extends BaseDto<LeaveRequest> {
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;

    @Enumerated(EnumType.STRING)
    private LeaveStatus status;
    @Enumerated(EnumType.STRING)
    private LeaveType leaveType;
}
