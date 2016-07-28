/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.employeeMS.entity;

/**
 *
 * @author Admin
 */
public class Employee {
     private int id,salary;
    private String Employeename,company,post;
    private boolean status;

    public Employee() {
    }

    public Employee(int id, int salary, String Employeename, String company, String post, boolean status) {
        this.id = id;
        this.salary = salary;
        this.Employeename = Employeename;
        this.company = company;
        this.post = post;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployeename() {
        return Employeename;
    }

    public void setEmployeename(String Employeename) {
        this.Employeename = Employeename;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
