package com.osmrh.rh.model;

import com.osmrh.rh.enums.LeaveStatus;
import com.osmrh.rh.enums.LeaveType;
import com.xdev.xdevbase.entities.BaseEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "leave_requests")
public class LeaveRequest extends BaseEntity implements Serializable {

    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private long duration_days;

    @Enumerated(EnumType.STRING)
    private LeaveStatus status;
    @Enumerated(EnumType.STRING)
    private LeaveType leaveType;

    //relation avec conge
    @ManyToOne
    @JoinColumn(name = "conge_id")
    private Conge conge;

    public long getDuration_days() {
        return duration_days;
    }

    public void setDuration_days(long duration_days) {
        this.duration_days = duration_days;
    }

    public Conge getConge() {
        return conge;
    }

    public void setConge(Conge conge) {
        this.conge = conge;
    }

    // Getters et Setters
    public LeaveType getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(LeaveType leaveType) {
        this.leaveType = leaveType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LeaveStatus getStatus() {
        return status;
    }

    public void setStatus(LeaveStatus status) {
        this.status = status;
    }
}
