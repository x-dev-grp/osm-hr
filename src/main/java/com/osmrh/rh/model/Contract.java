package com.osmrh.rh.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.osmrh.rh.enums.ContractStatus;
import com.osmrh.rh.enums.ContractType;
import com.xdev.xdevbase.entities.BaseEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "contracts")
public class Contract extends BaseEntity implements Serializable {
    private LocalDate startDate;
    private LocalDate endDate;
    private long salary;


    @Enumerated(EnumType.STRING)
    private ContractType contractType;

    @Enumerated(EnumType.STRING)
    private ContractStatus contractStatus;





    // Getters et Setters

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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste position) {
        this.poste = position;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public ContractStatus getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(ContractStatus contractStatus) {
        this.contractStatus = contractStatus;
    }

    // Many contracts for one employee
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    @JsonBackReference("employee-contracts")
    private Employee employee;

    // Each contract has exactly one Poste (job/position)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "poste_id", nullable = false)
    private Poste poste;

    // --- Getters/Setters ---
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}

