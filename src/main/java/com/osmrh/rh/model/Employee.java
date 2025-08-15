package com.osmrh.rh.model;

import com.osmrh.rh.enums.Gender;
import com.osmrh.rh.enums.MaritalStatus;
import com.xdev.xdevbase.entities.BaseEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee extends BaseEntity implements Serializable {

    private String firstName;
    private String lastName;
    private LocalDate hire_date;
    private LocalDate birthDate;
    private String cin;
    private String email;
    private String phone;
    private String address;
    private String postal_code;
    private String city;
    private String country;
    private boolean is_active;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    //relation avec contrat
    @OneToMany(mappedBy = "employee")
    private List<Contract> contrats;

    public List<Contract> getContrats() {
        return contrats;
    }

    public void setContrats(List<Contract> contrats) {
        this.contrats = contrats;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
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

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<PayRolls> getPayrolls() {
        return payrolls;
    }

    public void setPayrolls(List<PayRolls> payrolls) {
        this.payrolls = payrolls;
    }

    public List<Pointage> getPointages() {
        return pointages;
    }

    public void setPointages(List<Pointage> pointages) {
        this.pointages = pointages;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    // Relation avec Department
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    // Relation avec Payroll
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<PayRolls> payrolls;
    // Relation avec Pointage
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Pointage> pointages;


}