package com.StarkIndustries.HibernateMark3.Main;

import com.StarkIndustries.HibernateMark3.Utility.HibernateUtility;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMark3Application {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMark3Application.class, args);
		System.out.println(HibernateUtility.getSessionFactory());
	}

}
