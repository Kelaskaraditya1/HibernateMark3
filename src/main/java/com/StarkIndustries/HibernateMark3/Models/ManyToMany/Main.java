package com.StarkIndustries.HibernateMark3.Models.ManyToMany;

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

        Employee employee1 = new Employee();
        employee1.setId(101);
        employee1.setName("Aditya Kelaskar");
        employee1.setDepartment("Android");
        employee1.setEmail("kelaskaraditya1@gmail.com");

        Employee employee2 = new Employee();
        employee2.setId(102);
        employee2.setName("Sandesh");
        employee2.setDepartment("Web DEvloper");
        employee2.setEmail("sandyj1@gmail.com");

        Employee employee3 = new Employee();
        employee3.setId(103);
        employee3.setName("Mayur Khatal");
        employee3.setDepartment("Android/Web Developer");
        employee3.setEmail("mayurk1@gmail.com");

        Address address1 = new Address();
        address1.setId(201);
        address1.setAddress("Bhandup");

        Address address2 = new Address();
        address2.setId(202);
        address2.setAddress("Pune");

        Address address3 = new Address();
        address3.setId(203);
        address3.setAddress("Maharashtra");

        List<Employee> list1 = new ArrayList<>();
        list1.add(employee1);
        list1.add(employee2);

        List<Employee> list2 = new ArrayList<>();
        list2.add(employee2);
        list2.add(employee3);

        List<Employee> list3 = new ArrayList<>();
        list3.add(employee3);
        list3.add(employee1);

        List<Employee> list4 = new ArrayList<>();
        list4.add(employee1);
        list4.add(employee2);
        list4.add(employee3);

        List<Address> addressList1 = new ArrayList<>();
        addressList1.add(address1);
        addressList1.add(address2);

        List<Address> addressList2 = new ArrayList<>();
        addressList2.add(address2);
        addressList2.add(address3);

        List<Address> addressList3 = new ArrayList<>();
        addressList3.add(address3);
        addressList3.add(address1);

        List<Address> addressList4 = new ArrayList<>();
        addressList4.add(address1);
        addressList4.add(address2);
        addressList4.add(address3);


        employee1.setAddressList(addressList1);
        employee2.setAddressList(addressList2);
        employee3.setAddressList(addressList3);

        address1.setEmployeeList(list1);
        address2.setEmployeeList(list2);
        address3.setEmployeeList(list3);

        // Saving Employee and Address

        session.save(employee1);
        session.save(employee2);
        session.save(employee3);

        session.save(address1);
        session.save(address2);
        session.save(address3);


        transaction.commit();
        session.close();
        factory.close();
    }
}
