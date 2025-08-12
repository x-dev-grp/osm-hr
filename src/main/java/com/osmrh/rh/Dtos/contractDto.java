package com.osmrh.rh.Dtos;

import com.osmrh.rh.enums.contractType;
import com.osmrh.rh.model.Contract;
import com.osmrh.rh.model.Employee;
import com.xdev.xdevbase.dtos.BaseDto;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public class contractDto extends BaseDto<Contract> {
    private Employee employee;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean active;
    @Enumerated(EnumType.STRING)
    private contractType contractType;
}

