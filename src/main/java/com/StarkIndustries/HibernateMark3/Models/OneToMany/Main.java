package com.StarkIndustries.HibernateMark3.Models.OneToMany;

import com.StarkIndustries.HibernateMark3.Utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Address address1 = new Address(1,"Mumbai","Permanent");
        Address address2 = new Address(2,"Pune","Job");
        Address address3 = new Address(3,"Banglore","Job2");
        Address address4 = new Address(4,"Delhi","Microdoft");

        List<Address> addressList = new ArrayList<Address>();
        addressList.add(address1);
        addressList.add(address2);
        addressList.add(address3);
        addressList.add(address4);

        Employee employee = new Employee(101,"Aditya",addressList,"kelaskaraditya1@gmail.com");

//        Saving Entity in database.

//        session.save(address1);
//        session.save(address2);
//        session.save(address3);
//        session.save(address4);
//
//        session.save(employee);


//        Getting Employee Details with list of address

        Employee employee1 = session.get(Employee.class,101);

        System.out.println("Employee Id:"+employee1.getId());
        System.out.println("Employee Name:"+employee1.getName());
        System.out.println("Employee Email:"+employee1.getEmail());

        employee1.getAddress().forEach(value->{
            System.out.println("AddressType:"+value.getAddressType()+" Address:"+value.getAddress());
        });

        transaction.commit();
        session.close();
        factory.close();
    }
}
