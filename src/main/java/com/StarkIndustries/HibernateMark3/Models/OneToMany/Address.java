package com.StarkIndustries.HibernateMark3.Models.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", addressType='" + addressType + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    @Column(name = "Address",nullable = false)
    private String address;

    @Column(name = "AddressType")
    private String addressType;

    public Address(int id,String address,String addressType){
        this.id=id;
        this.address=address;
        this.addressType=addressType;
    }

    public Address(String address,String addressType){
        this.address=address;
        this.addressType=addressType;
    }

    public Address(){

    }
}
