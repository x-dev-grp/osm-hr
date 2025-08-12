package com.osmrh.rh.Dtos;

import com.osmrh.rh.enums.Gender;
import com.osmrh.rh.model.Employee;
import com.xdev.xdevbase.dtos.BaseDto;

import java.time.LocalDate;

public class EmployeeDto extends BaseDto<Employee> {
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private String cin;
    private String email;
    private String phone;
    private String position;
    private String address;
    private String city;
    private String country;
    private Double salary;
    // ... getters/setters
}


