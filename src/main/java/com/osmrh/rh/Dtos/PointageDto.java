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
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalTime checkOut) {
        this.checkOut = checkOut;
    }

    public PointageStatus getStatus() {
        return status;
    }

    public void setStatus(PointageStatus status) {
        this.status = status;
    }
}
