/**
 * 
 */
package com.hibernate.dao;

import java.util.List;

import com.hibernate.pojo.Customer;

/**
 * @author: Yijun Chen
 * @date: Feb 23, 2017
 * @time: 5:02:06 PM
 */
public interface CustomerDao {
	public int addCustomer(Customer c);
	public void deleteCustomer(Class Customer, int id);
	public void updateCustomer(Customer c);
	public Customer viewCustomerById(int id);
	public Customer viewCustomerByCustomerName(String name);
	public Customer viewCustomerByEmail(String email);
	public List<Customer> viewAllCustomers();

}
