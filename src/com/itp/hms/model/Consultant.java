package com.itp.hms.model;

import java.time.LocalDate;

public class Consultant {

    private String consultantId;
    private String name;
    private String empNum;
    private String password;
    private String contact;
    private String email;
    private double salary;
    private LocalDate joinDate;
    private String specialArea;

    // Constructor
    public Consultant(String consultantId, String name, String empNum, String password, String contact, String email, double salary, LocalDate joinDate, String specialArea) {
        this.consultantId = consultantId;
        this.name = name;
        this.empNum = empNum;
        this.password = password;
        this.contact = contact;
        this.email = email;
        this.salary = salary;
        this.joinDate = joinDate;
        this.specialArea = specialArea;
    }

    // Default Constructor
    public Consultant() {
    }

    // Getters and Setters

    public String getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = consultantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public String getSpecialArea() {
        return specialArea;
    }

    public void setSpecialArea(String specialArea) {
        this.specialArea = specialArea;
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "consultantId='" + consultantId + '\'' +
                ", name='" + name + '\'' +
                ", empNum='" + empNum + '\'' +
                ", password='" + password + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", joinDate=" + joinDate +
                ", specialArea='" + specialArea + '\'' +
                '}';
    }
}
