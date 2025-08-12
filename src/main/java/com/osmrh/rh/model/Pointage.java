package com.osmrh.rh.model;

import com.osmrh.rh.enums.PointageStatus;
import com.xdev.xdevbase.entities.BaseEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "pointages")
public class Pointage extends BaseEntity implements Serializable {

    private LocalDate date;
    private LocalTime checkIn;
    private LocalTime checkOut;

    @Enumerated(EnumType.STRING)
    private PointageStatus status;

    //relation

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    // Getters et Setters
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