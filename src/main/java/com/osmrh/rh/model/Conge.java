package com.osmrh.rh.model;

import com.osmrh.rh.enums.LeaveStatus;
import com.osmrh.rh.enums.LeaveType;
import com.xdev.xdevbase.entities.BaseEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "conges")
public class Conge extends BaseEntity implements Serializable {

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String raison;
    private LocalDate dateCreation;

    @Enumerated(EnumType.STRING)
    private LeaveStatus statut;
    @Enumerated(EnumType.STRING)
    private LeaveType type;



    //relation
    // Lien avec Employee
    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    // Lien avec  leaveRequest
    @OneToMany(mappedBy = "conge", cascade = CascadeType.ALL)
    private List<LeaveRequest> leaveRequests;

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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<LeaveRequest> getLeaveRequests() {
        return leaveRequests;
    }

    public void setLeaveRequests(List<LeaveRequest> leaveRequests) {
        this.leaveRequests = leaveRequests;
    }
}

