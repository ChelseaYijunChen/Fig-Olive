/**
 * 
 */
package com.hibernate.dao;

import java.util.List;

import com.hibernate.pojo.Customer;
import com.hibernate.util.HibernateTemplate;

/**
 * @author: Yijun Chen
 * @date: Feb 23, 2017
 * @time: 5:02:20 PM
 */
public class CustomerDaoImpl implements CustomerDao{

	@Override
	public int addCustomer(Customer c) {
		Integer i = (Integer)HibernateTemplate.save(c);
		return i;
	}

	@Override
	public void deleteCustomer( Class cus, int id) {
		HibernateTemplate.delete(Customer.class, id);	
	}

	@Override
	public void updateCustomer(Customer c) {
		HibernateTemplate.update(c);
	}

	@Override
	public Customer viewCustomerById(int id) {
		List<Customer> c = (List<Customer>)HibernateTemplate.find("From Customer where customerId= '"+id+"' ");	
		if(c==null || c.size()==0){
			return null;
		} else {
			return c.get(0);
		}
	}

	@Override
	public Customer viewCustomerByEmail(String email) {
		List<Customer> c = (List<Customer>)HibernateTemplate.find("From Customer where email= '"+email+"' ");	
		if(c==null || c.size()==0){
			return null;
		} else {
			return c.get(0);
		}
	}

	@Override
	public List<Customer> viewAllCustomers() {
		List<Customer> cList = (List<Customer>)HibernateTemplate.find("From Customer");	
		return cList;
	}

	@Override
	public Customer viewCustomerByCustomerName(String name) {
		List<Customer> c = (List<Customer>)HibernateTemplate.find("From Customer where customerName= '"+name+"' ");	
		if(c == null || c.size()==0){
			return null;
		}else {
			return c.get(0);
		}
	}

}
