package com.osmrh.rh.Dtos;

import com.osmrh.rh.enums.contractType;
import com.osmrh.rh.enums.contract_status;
import com.osmrh.rh.model.Contract;
import com.osmrh.rh.model.Employee;
import com.xdev.xdevbase.dtos.BaseDto;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public class ContractDto extends BaseDto<Contract> {
    private Employee employee;
    private LocalDate startDate;
    private LocalDate endDate;
    private long salary;
    private String position;
    private contract_status contractStatus;


    //geter and Seter
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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

    public contractType getContractType() {
        return contractType;
    }

    public void setContractType(contractType contractType) {
        this.contractType = contractType;
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

    public contract_status getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(contract_status contractStatus) {
        this.contractStatus = contractStatus;
    }

    @Enumerated(EnumType.STRING)
    private contractType contractType;
}

