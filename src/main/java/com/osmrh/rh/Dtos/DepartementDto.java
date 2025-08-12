package com.osmrh.rh.Dtos;


import com.osmrh.rh.model.Department;
import com.xdev.xdevbase.dtos.BaseDto;

import java.time.LocalDate;

public class DepartementDto extends BaseDto<Department> {
    private String name;
    private String description;
    private Long managerId;
}