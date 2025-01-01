package com.StarkIndustries.HibernateMark3.Models.OneToOne;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeId")
    private int id;

    @Column(name = "EmployeeName",nullable = false)
    private String name;

    @Column(name = "EmployeeEmail",nullable = false)
    private String email;

    @Column(name = "EmployeeDepartment",nullable = false)
    private String department;

    @OneToOne
    private Address address;

    public Employee(int id,String name,String email,String department,Address address){
        this.id=id;
        this.name=name;
        this.email=email;
        this.department=department;
        this.address=address;
    }

    public Employee(int id,String name,String email,String department){
        this.id=id;
        this.name=name;
        this.email=email;
        this.department=department;
    }

    public Employee(String name,String email,String department){
        this.name=name;
        this.email=email;
        this.department=department;
    }

    public Employee(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", address=" + address +
                '}';
    }

}
