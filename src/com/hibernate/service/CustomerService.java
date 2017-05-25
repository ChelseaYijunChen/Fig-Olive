/**
 * 
 */
package com.hibernate.service;

import java.util.List;

import com.hibernate.pojo.Customer;

/**
 * @author: Yijun Chen
 * @date: Feb 23, 2017
 * @time: 4:52:06 PM
 */
public interface CustomerService {
	public int addCustomer(Customer c);
	public void deleteCustomer(Class customer, int id);
	public void updateCustomer(Customer c);
	public Customer viewCustomerById(int id);
	public Customer viewCustomerByEmail(String email);
	public Customer viewCustomerByCustomerName(String name);
	public List<Customer> viewAllCustomer();

}
