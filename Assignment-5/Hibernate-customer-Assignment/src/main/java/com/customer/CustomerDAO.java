package com.customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerDAO {
    private SessionFactory factory;

    public CustomerDAO() {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();
    }

    public void saveOrUpdate(Customer customer) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(customer); // Call saveOrUpdate()
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Customer getById(int id) {
        Session session = factory.openSession();
        Customer customer = null;
        try {
            customer = session.get(Customer.class, id); // Call get method with Customer class and Id
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return customer;
    }

    public void delete(int id) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Customer customer = session.get(Customer.class, id);
            if (customer != null) {
                session.delete(customer); // Call delete()
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
