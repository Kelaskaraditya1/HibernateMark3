package com.StarkIndustries.HibernateMark3.Models.ManyToMany;

import com.StarkIndustries.HibernateMark3.Utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        factory.close();
    }
}
