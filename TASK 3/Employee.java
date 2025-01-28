package com.example.hpedemo;

public class Employee {
    private String employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    public Employee(String employee_id, String first_name, String last_name, String email, String title) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public Employee setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
        return this;
    }

    public Employee setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public Employee setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public Employee setTitle(String title) {
        this.title = title;
        return this;
    }
}
