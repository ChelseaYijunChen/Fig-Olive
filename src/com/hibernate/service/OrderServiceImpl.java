/**
 * 
 */
package com.hibernate.service;

import java.util.List;

import com.hibernate.pojo.Order;
import com.hibernate.dao.OrderDao;
import com.hibernate.dao.OrderDaoImpl;

/**
 * @author: Yijun Chen
 * @date: Mar 4, 2017
 * @time: 6:34:21 PM
 */
public class OrderServiceImpl implements OrderService{

	@Override
	public int addOrder(Order trans) {
		OrderDao cDao = new OrderDaoImpl();
		int i = cDao.addOrder(trans);
		return i;
	}

	@Override
	public void updateOrder(Order trans) {
		OrderDao cDao = new OrderDaoImpl();
		cDao.updateOrder(trans);		
	}

	@Override
	public List<Order> viewAllOrders() {
		OrderDao cDao = new OrderDaoImpl();
		List<Order> transList = cDao.viewAllOrders();
		return transList;
	}

	@Override
	public Order viewOrderById(int id) {
		OrderDao cDao = new OrderDaoImpl();
		Order trans = cDao.viewOrderById(id);
		return trans;
	}

	@Override
	public List<Order> viewOrderByCustomerId(int customerId) {
		OrderDao cDao = new OrderDaoImpl();
		List<Order> trans = cDao.viewOrderByCustomerId(customerId);
		return trans;
	}
}
