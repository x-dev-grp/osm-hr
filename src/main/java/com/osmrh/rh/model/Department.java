package com.osmrh.rh.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.xdev.xdevbase.entities.BaseEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department extends BaseEntity implements Serializable {
    private String name;
    private String description;
    // Department has many Employees
    @OneToMany(mappedBy = "department")
    @JsonManagedReference("department-employees")
    private List<Employee> employees = new java.util.ArrayList<>();

    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) {
        this.employees = (employees != null) ? employees : new java.util.ArrayList<>();
    }

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


}

