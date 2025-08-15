package com.osmrh.rh.Dtos;

import com.osmrh.rh.enums.LeaveStatus;
import com.osmrh.rh.enums.LeaveType;
import com.osmrh.rh.model.Conge;
import com.xdev.xdevbase.dtos.BaseDto;
import java.time.LocalDate;
import java.util.List;

public class CongeDto  extends BaseDto<Conge>{
    LocalDate dateDebut;
    LocalDate dateFin;
    String raison;
    LocalDate dateCreation;
    LeaveStatus statut;
    LeaveType type;
    EmployeeDto employee;
    List<LeaveRequestDto> leaveRequests;

    //geter and seter


    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LeaveStatus getStatut() {
        return statut;
    }

    public void setStatut(LeaveStatus statut) {
        this.statut = statut;
    }

    public LeaveType getType() {
        return type;
    }

    public void setType(LeaveType type) {
        this.type = type;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDto employee) {
        this.employee = employee;
    }

    public List<LeaveRequestDto> getLeaveRequests() {
        return leaveRequests;
    }

    public void setLeaveRequests(List<LeaveRequestDto> leaveRequests) {
        this.leaveRequests = leaveRequests;
    }
}