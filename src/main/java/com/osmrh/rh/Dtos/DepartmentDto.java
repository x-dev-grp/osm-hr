package com.osmrh.rh.Dtos;


import com.osmrh.rh.model.Department;
import com.osmrh.rh.model.Employee;
import com.xdev.xdevbase.dtos.BaseDto;

import java.util.List;


public class DepartmentDto extends BaseDto<Department> {

    private String name;
    private String description;
    private Employee managerId;
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

    public Employee getManagerId() {
        return managerId;
    }

    public void setManagerId(Employee managerId) {
        this.managerId = managerId;
    }

    public List<EmployeeDto> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }
}