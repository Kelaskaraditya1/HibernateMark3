package com.StarkIndustries.HibernateMark3.Models.ManyToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String address;

    @Column
    @ManyToMany
    private List<Employee> employeeList;

    public Address(int id,String address,List<Employee> employeeList){
        this.id=id;
        this.address=address;
        this.employeeList=employeeList;
    }

    public Address(String address,List<Employee> employeeList){
        this.address=address;
        this.employeeList=employeeList;
    }

    public Address(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
