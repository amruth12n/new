package com.order;

import java.util.Date;
import java.util.List;

import com.orderDao.OrderDAO;
import com.orderDao.OrderItemDAO;

public class Main {
    public static void main(String[] args) {
        OrderDAO orderDAO = new OrderDAO();
        OrderItemDAO orderItemDAO = new OrderItemDAO();

        // Create Order
        Order order = new Order();
        order.setOrderDate(new Date());
        orderDAO.saveOrUpdate(order);
        System.out.println("Order created: " + order);

        // Create OrderItems
        OrderItem orderItem1 = new OrderItem(0, order, "Product-1", 2);
        orderItemDAO.saveOrUpdate(orderItem1);
        System.out.println("Order item created: " + orderItem1);

        OrderItem orderItem2 = new OrderItem(0, order, "Product-2", 5);
        orderItemDAO.saveOrUpdate(orderItem2);
        System.out.println("Order item created: " + orderItem2);

        // Read Order
        Order retrievedOrder = orderDAO.getById(order.getId());
        System.out.println("Retrieved order: " + retrievedOrder);

        // Read OrderItems
        List<OrderItem> orderItems = orderItemDAO.getByOrderId(order.getId());
        System.out.println("Order items for order " + order.getId() + ": " + orderItems);

        // Update OrderItem
        orderItem1.setQuantity(3);
        orderItemDAO.saveOrUpdate(orderItem1);
        System.out.println("Updated order item: " + orderItem1);

        // Delete OrderItem
        orderItemDAO.delete(orderItem2.getId());
        System.out.println("Order item deleted: " + orderItem2);

        // Read OrderItems again
        orderItems = orderItemDAO.getByOrderId(order.getId());
        System.out.println("Order items for order " + order.getId() + " after deletion: " + orderItems);

        // Delete Order
        orderDAO.delete(order.getId());
        System.out.println("Order deleted: " + order);
    }
}
