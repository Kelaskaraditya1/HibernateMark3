package com.StarkIndustries.HibernateMark3.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

    @Id
    private int id;

    @Column(name = "EmployeeCountry",nullable = false)
    private String country;

    @Column(name = "EmployeeState",nullable = false)
    private String state;

    @Column(name = "EmployeeCity",nullable = true)
    private String city;

    public Address(String country,String state,String city){
        this.country=country;
        this.state=state;
        this.city=city;
    }

    public Address(String state,String city){
        this.state=state;
        this.city=city;
    }

    public Address(){

    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
