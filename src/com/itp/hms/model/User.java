package com.itp.hms.model;

import java.time.LocalDate;

public class User {
    private String user_id;
    private String emp_num;
    private String role;
    private String email;
    private String name;
    private String contact;
    private String password;
    private LocalDate join_date;

    public User() {
    }

    public User(String user_id,
                String emp_num,
                String role,
                String email,
                String name,
                String contact,
                String password, LocalDate join_date) {
        this.user_id = user_id;
        this.emp_num = emp_num;
        this.role = role;
        this.email = email;
        this.name = name;
        this.contact = contact;
        this.password = password;
        this.join_date = join_date;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getEmp_num() {
        return emp_num;
    }

    public void setEmp_num(String emp_num) {
        this.emp_num = emp_num;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getJoin_date() {
        return join_date;
    }

    public void setJoin_date(LocalDate join_date) {
        this.join_date = join_date;
    }
}
