package com.osmrh.rh.model;

import com.osmrh.rh.enums.contractType;
import com.osmrh.rh.enums.contract_status;
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
    private String position;

    @Enumerated(EnumType.STRING)
    private contractType contractType;

    @Enumerated(EnumType.STRING)
    private contract_status contractStatus;


    //relation avec employee
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public contractType getContractType() {
        return contractType;
    }

    public void setContractType(contractType contractType) {
        this.contractType = contractType;
    }

    public contract_status getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(contract_status contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

