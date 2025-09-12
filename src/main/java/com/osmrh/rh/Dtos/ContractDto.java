package com.osmrh.rh.Dtos;

import com.osmrh.rh.enums.ContractStatus;
import com.osmrh.rh.enums.ContractType;
import com.osmrh.rh.model.Contract;
import com.osmrh.rh.model.Employee;
import com.xdev.xdevbase.dtos.BaseDto;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public class ContractDto extends BaseDto<Contract> {
     private LocalDate startDate;
    private LocalDate endDate;
    private long salary;
    private PosteDto poste;
    private ContractStatus contractStatus;



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

    @Enumerated(EnumType.STRING)
    private ContractType contractType;

    public ContractType getContractType() {
        return contractType;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public PosteDto getPoste() {
        return poste;
    }

    public void setPoste(PosteDto poste) {
        this.poste = poste;
    }

    public ContractStatus getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(ContractStatus contractStatus) {
        this.contractStatus = contractStatus;
    }
}

