package com.StarkIndustries.HibernateMark3.Main;

import com.StarkIndustries.HibernateMark3.Models.OneToOne.Address;
import com.StarkIndustries.HibernateMark3.Models.OneToOne.Employee;
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


		// Bidirectional relationship


		Employee employee1 = new Employee();
		employee1.setName("Mayur");
		employee1.setEmail("mayurkhatla1@gmail.com");
		employee1.setDepartment("Web-Developer-Advance");
		Address address1 = new Address();
		address1.setCountry("Russian");
		address1.setState("Dagistan");
		address1.setCity("Mumbai");
		address.setEmployee(employee1);
		employee1.setAddress(address1);

//		session.save(address1);
//		session.save(employee1);

		System.out.println(session.get(Address.class,0));
		System.out.println(session.get(Employee.class,4));

		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
