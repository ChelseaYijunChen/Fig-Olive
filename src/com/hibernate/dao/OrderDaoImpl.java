/**
 * 
 */
package com.hibernate.dao;

import java.util.List;

import com.hibernate.pojo.Order;
import com.hibernate.util.HibernateTemplate;

/**
 * @author: Yijun Chen
 * @date: Mar 4, 2017
 * @time: 6:25:58 PM
 */
public class OrderDaoImpl implements OrderDao{

	@Override
	public int addOrder(Order Order) {
		Integer i = (Integer)HibernateTemplate.save(Order);
		return i;
	}

	@Override
	public void updateOrder(Order Order) {
		HibernateTemplate.update(Order);	
	}

	@Override
	public List<Order> viewAllOrders() {
		List<Order> cList = (List<Order>)HibernateTemplate.find("From Order");	
		return cList;
	}

	@Override
	public Order viewOrderById(int orderId) {
		List<Order> cList = (List<Order>)HibernateTemplate.find("From Order where orderId= '"+ orderId+"' ");	
		return cList.get(0);
	}

	@Override
	public List<Order> viewOrderByCustomerId(int customerId) {
		List<Order> oList = (List<Order>)HibernateTemplate.find("From Order where customerId= '"+customerId+"' ");	
		return oList;
	}
}
