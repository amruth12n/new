package com.orderDao;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.order.Order;
public class OrderDAO {
	 private SessionFactory factory;
	 public OrderDAO() {
		 Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		 factory = cfg.buildSessionFactory();
	 }
	 
	 public void saveOrUpdate(Order order) {
		 Session session = factory.openSession();
		 Transaction tx = null;
		 try {
			 tx = session.beginTransaction();
			 session.saveOrUpdate(order);
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
	 
	 public Order getById(int id) {
		 Session session = factory.openSession();
		 Order order = null;
		 try {
			 order = session.get(Order.class, id);
		 } catch (Exception e) {
			 e.printStackTrace();
		 } finally {
			 session.close();
		 }
		 return order;
	 }
	 
	 public void delete(int id) {
		 Session session = factory.openSession();
		 Transaction tx = null;
		 try {
			 tx = session.beginTransaction();
			 Order order = session.get(Order.class, id);
			 if (order != null) {
				 session.delete(order);
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