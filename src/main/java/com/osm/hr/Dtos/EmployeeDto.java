package com.osm.hr.Dtos;

import com.osm.hr.enums.Gender;
import com.osm.hr.model.Employee;
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


