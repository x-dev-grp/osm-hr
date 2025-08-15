package com.osmrh.rh.Dtos;


import com.osmrh.rh.model.Department;
import com.xdev.xdevbase.dtos.BaseDto;

import java.util.List;


public class DepartmentDto extends BaseDto<Department> {

    private String name;
    private String description;
    private Long managerId;
    private List<EmployeeDto> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public List<EmployeeDto> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }
}