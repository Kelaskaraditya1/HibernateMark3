package com.StarkIndustries.HibernateMark3.Models.ManyToMany;

import com.StarkIndustries.HibernateMark3.Models.OneToMany.Address;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

public class Employee {
    @Id
    private int id;

    @Column(name = "EmployeeName",nullable = false)
    private String name;

    @Column(name = "EmployeeAddress",nullable = false)
    @ManyToMany
    private List<com.StarkIndustries.HibernateMark3.Models.OneToMany.Address> address;

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

    public List<com.StarkIndustries.HibernateMark3.Models.OneToMany.Address> getAddress() {
        return address;
    }

    public void setAddress(List<com.StarkIndustries.HibernateMark3.Models.OneToMany.Address> address) {
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

    public Employee(int id, String name, List<com.StarkIndustries.HibernateMark3.Models.OneToMany.Address> address, String email){
        this.id=id;
        this.name=name;
        this.address=address;
        this.email=email;
    }

    public Employee(String name, List<Address> address, String email){
        this.name=name;
        this.address=address;
        this.email=email;
    }

    public Employee(){

    }
}
