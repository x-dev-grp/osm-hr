package com.osmrh.rh.Dtos;

import com.osmrh.rh.enums.PointageStatus;
import com.osmrh.rh.model.Pointage;
import com.xdev.xdevbase.dtos.BaseDto;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;
import java.time.LocalTime;

public class PointageDto extends BaseDto<Pointage> {
    private LocalDate date;

    private LocalTime checkIn;
    private LocalTime checkOut;

    @Enumerated(EnumType.STRING)
    private PointageStatus status;

}
