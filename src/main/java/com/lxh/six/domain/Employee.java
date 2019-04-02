package com.lxh.six.domain;

public class Employee {
    private Integer id;

    private String name;

    private String role;

    private Long salary;

    public Integer getId() {
        return id;
    }

    public Employee withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Employee withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public Employee withRole(String role) {
        this.setRole(role);
        return this;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getSalary() {
        return salary;
    }

    public Employee withSalary(Long salary) {
        this.setSalary(salary);
        return this;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}