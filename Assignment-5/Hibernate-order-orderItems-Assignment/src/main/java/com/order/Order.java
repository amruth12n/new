package com.order;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "orders")
public class Order {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 @Temporal(TemporalType.TIMESTAMP)
	 private Date orderDate;
	 @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	 private List<OrderItem> orderItems = new ArrayList<>();
	 
	 
	public Order(int id, Date orderDate, List<OrderItem> orderItems) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.orderItems = orderItems;
	}


	public Order() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public List<OrderItem> getOrderItems() {
		return orderItems;
	}


	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", orderItems=" + orderItems + "]";
	}
	
	
}