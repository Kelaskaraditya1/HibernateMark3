package com.StarkIndustries.HibernateMark3.Main;

import com.StarkIndustries.HibernateMark3.Models.Address;
import com.StarkIndustries.HibernateMark3.Models.Employee;
import com.StarkIndustries.HibernateMark3.Utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMark3Application {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMark3Application.class, args);

		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// Inserting Employee Details.

		Address address = new Address();
		address.setCountry("India");
		address.setCity("Mumbai");
		address.setState("Maharashtra");

		Employee employee = new Employee();
		employee.setName("Aditya");
		employee.setDepartment("Computer");
		employee.setEmail("kelaskaraditya1@gmail.com");
		employee.setAddress(address);

//		session.save(address);
//		session.save(employee);


		// Getting Single Object From Database.

//		Employee employee1 = session.get(Employee.class,1);
//		System.out.println(employee1);
//		System.out.println();
//		System.out.println(employee1.getAddress());

//		Address address1 = session.get(Address.class,0);
//		System.out.println(address1);

		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
