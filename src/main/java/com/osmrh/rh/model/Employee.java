package com.osmrh.rh.model;

import com.osmrh.rh.enums.*;
import com.xdev.xdevbase.entities.BaseEntity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee extends BaseEntity implements Serializable {

    private String firstName;
    private String lastName;
    private LocalDate hire_date;
    private LocalDate birthDate;
    private LocalDate  termination_date;
    private String cin;
    private String email;
    private String phone;
    private String position;
    private String address;
    private String postal_code;
    private String city;
    private String country;
    private boolean is_active;


    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    public LocalDate getBirth_date() {
        return birthDate;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birthDate = birth_date;
    }

    public LocalDate getTermination_date() {
        return termination_date;
    }

    public void setTermination_date(LocalDate termination_date) {
        this.termination_date = termination_date;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public marital_status getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(marital_status maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public PointageStatus getPointageStatus() {
        return pointageStatus;
    }

    public void setPointageStatus(PointageStatus pointageStatus) {
        this.pointageStatus = pointageStatus;
    }

    public List<Contract> getContrats() {
        return contrats;
    }

    public void setContrats(List<Contract> contrats) {
        this.contrats = contrats;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Conge getConge() {
        return conge;
    }

    public void setConge(Conge conge) {
        this.conge = conge;
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

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private marital_status maritalStatus;

    @Enumerated(EnumType.STRING)
    private PointageStatus  pointageStatus;



//relation avec contrat
@OneToMany(mappedBy = "employee")
private List<Contract> contrats;

    // Relation avec Department
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    //relation avec conge
    @ManyToOne
    @JoinColumn(name = "conge_id", nullable = false)
    private Conge conge;


    // Relation avec Payroll
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<PayRolls> payrolls;

    // Relation avec Pointage
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Pointage> pointages;



    //get et set
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return hire_date;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.hire_date = birthDate;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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



    }