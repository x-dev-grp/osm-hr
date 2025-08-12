package com.osmrh.rh.Dtos;

import com.osmrh.rh.model.PayRolls;
import com.xdev.xdevbase.dtos.BaseDto;

import java.time.LocalDate;

public class PayRollsDto extends BaseDto<PayRolls>{
private LocalDate periodStart;
private LocalDate periodEnd;

private Double baseSalary;
private Double bonuses;
private Double deduction;
private Double netSalary;
private Boolean paid;
private LocalDate paymentDate;
}
