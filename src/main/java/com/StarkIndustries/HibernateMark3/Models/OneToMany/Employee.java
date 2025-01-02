package com.StarkIndustries.HibernateMark3.Models.OneToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    private int id;

    @Column(name = "EmployeeName",nullable = false)
    private String name;

    @Column(name = "EmployeeAddress",nullable = false)
    @OneToMany
    private List<Address> address;

    @Column(name = "EmployeeEmail",nullable = false)
    private String email;

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

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                '}';
    }

    public Employee(int id, String name, List<Address> address, String email){
        this.id=id;
        this.name=name;
        this.address=address;
        this.email=email;
    }

    public Employee(String name,List<Address> address,String email){
        this.name=name;
        this.address=address;
        this.email=email;
    }

    public Employee(){

    }
}
