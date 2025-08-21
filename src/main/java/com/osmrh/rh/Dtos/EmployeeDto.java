package com.osmrh.rh.Dtos;

import com.osmrh.rh.enums.Gender;
import com.osmrh.rh.enums.MaritalStatus;
import com.osmrh.rh.model.Employee;
import com.xdev.xdevbase.dtos.BaseDto;

import java.time.LocalDate;
import java.util.List;

public class EmployeeDto extends BaseDto<Employee> {
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private String cin;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String country;
    private LocalDate hireDate;
    private String postalCode;
    private boolean isActive;
    private MaritalStatus maritalStatus;
    private List<ContractDto> contrats;
    private DepartmentDto department;
    private List<PayRollsDto> payrolls;
    private List<PointageDto> pointages;

    //geter and seter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public List<ContractDto> getContrats() {
        return contrats;
    }

    public void setContrats(List<ContractDto> contrats) {
        this.contrats = contrats;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }

    public List<PayRollsDto> getPayrolls() {
        return payrolls;
    }

    public void setPayrolls(List<PayRollsDto> payrolls) {
        this.payrolls = payrolls;
    }

    public List<PointageDto> getPointages() {
        return pointages;
    }

    public void setPointages(List<PointageDto> pointages) {
        this.pointages = pointages;
    }

}


