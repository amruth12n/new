package com.order;

import javax.persistence.*;
	@Entity
	@Table(name = "order_items")
	public class OrderItem {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 @ManyToOne
	 @JoinColumn(name = "order_id")
	 private Order order;
	 private String product;
	 private int quantity;

	 public OrderItem(int id, Order order, String product, int quantity) {
		super();
		this.id = id;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", order=" + order + ", product=" + product + ", quantity=" + quantity + "]";
	}
	
	
	 
}