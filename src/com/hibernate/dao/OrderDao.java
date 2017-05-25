/**
 * 
 */
package com.hibernate.dao;

import java.util.List;

import com.hibernate.pojo.Order;

/**
 * @author: Yijun Chen
 * @date: Mar 4, 2017
 * @time: 6:25:44 PM
 */
public interface OrderDao {
	public int addOrder(Order Order);
	public void updateOrder(Order Order);
	public List<Order> viewAllOrders();
	public Order viewOrderById(int id);
	public List<Order> viewOrderByCustomerId(int customerId);
}
