package com.StarkIndustries.HibernateMark3.Models.ManyToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "EmployeeName")
    private String name;

    @Column(name = "EmployeeEmail")
    private String email;

    @Column(name = "EmployeeDepartment")
    private String department;

    @Column
    @ManyToMany(mappedBy = "address")
    private List<Address> addressList;

    public Employee(int id,String name,String email,String department,List<Address> addressList){
        this.id=id;
        this.name=name;
        this.email=email;
        this.department=department;
        this.addressList=addressList;
    }

    public Employee(String name,String email,String department,List<Address> addressList){
        this.name=name;
        this.email=email;
        this.department=department;
        this.addressList=addressList;
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

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
