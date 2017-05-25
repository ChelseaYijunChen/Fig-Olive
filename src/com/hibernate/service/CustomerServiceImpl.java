/**
 * 
 */
package com.hibernate.service;

import java.util.List;

import com.hibernate.dao.CustomerDao;
import com.hibernate.dao.CustomerDaoImpl;
import com.hibernate.pojo.Customer;


/**
 * @author: Yijun Chen
 * @date: Feb 23, 2017
 * @time: 4:52:22 PM
 */
public class CustomerServiceImpl implements CustomerService{
	
	@Override
	public int addCustomer(Customer c) {
		
		CustomerDao cDao = new CustomerDaoImpl();
		int i = cDao.addCustomer(c);
		return i;
	}

	@Override
	public void deleteCustomer(Class customer, int id) {
		CustomerDao cDao = new CustomerDaoImpl();
		cDao.deleteCustomer(Customer.class, id);
	}

	@Override
	public void updateCustomer(Customer c) {
		CustomerDao cDao = new CustomerDaoImpl();
		cDao.updateCustomer(c);		
	}

	@Override
	public Customer viewCustomerById(int id) {
		CustomerDao cDao = new CustomerDaoImpl();
		Customer s = cDao.viewCustomerById(id);
		return s;
	}

	@Override
	public Customer viewCustomerByEmail(String email) {
		CustomerDao cDao = new CustomerDaoImpl();
		Customer s = cDao.viewCustomerByEmail(email);
		return s;
	}

	@Override
	public List<Customer> viewAllCustomer() {
		CustomerDao cDao = new CustomerDaoImpl();
		List<Customer> cList = cDao.viewAllCustomers();
		return cList;
	}

	@Override
	public Customer viewCustomerByCustomerName(String name) {
		CustomerDao cDao = new CustomerDaoImpl();
		Customer s = cDao.viewCustomerByCustomerName(name);
		return s;
	}



}
