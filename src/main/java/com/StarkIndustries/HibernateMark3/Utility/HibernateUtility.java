package com.StarkIndustries.HibernateMark3.Utility;

import com.StarkIndustries.HibernateMark3.Keys.Keys;
import com.StarkIndustries.HibernateMark3.Models.OneToOne.Address;
import com.StarkIndustries.HibernateMark3.Models.OneToOne.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtility {

    private static SessionFactory sessionFactory;

    public HibernateUtility(){

    }

    public static void setSessionFactory(SessionFactory sessionFactory) {
        HibernateUtility.sessionFactory = sessionFactory;
    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            Configuration configuration = new Configuration();
            Properties properties = new Properties();

            properties.put(Environment.DRIVER, Keys.DATABASE_DRIVER);
            properties.put(Environment.URL,Keys.DATABASE_URL);
            properties.put(Environment.USER,Keys.USERNAME);
            properties.put(Environment.PASS,Keys.PASSWORD);
            properties.put(Environment.DIALECT,Keys.DIALECT);
            properties.put(Environment.HBM2DDL_AUTO,Keys.HBD2DLL);
            properties.put(Environment.SHOW_SQL,true);
            properties.put(Environment.FORMAT_SQL,true);

            configuration.setProperties(properties);

            // Annotated Class.
            configuration.addAnnotatedClass(Employee.class);
            configuration.addAnnotatedClass(Address.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory=configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}
