/**
 * 
 */
package com.hibernate.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author: Yijun Chen
 * @date: Mar 4, 2017
 * @time: 3:23:03 PM
 */
@Entity
@Table(name = "Order10_TBL")
public class Order {
	private int orderId;
	private String orderDate;
	private int quanlity;
	private String companyName;
	private String deliveryDate;
	private Customer customer;
	private double totalPrice;
	private Set<Product> product = new HashSet<Product>(
			0);

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "orderId", unique = true, nullable = false)
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Column(name = "orderDate",  nullable = false)
	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "quanlity",  nullable = false)
	public int getQuanlity() {
		return quanlity;
	}

	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}

	@Column(name = "companyName",  nullable = true)
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "deliveryDate",  nullable = true)
	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerId", nullable = false)
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="Order10_TBL_Product10_TBL", joinColumns=@JoinColumn(name="Order_OrderId"), inverseJoinColumns=@JoinColumn(name="Product_Product_Id"))
	public Set<Product> getProduct() {
		return product;
	}

	@Column(name = "totalPrice",  nullable = false)
	public double getTotalPrice() {
		return totalPrice;
	}

	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
	public Order( String orderDate, int quanlity,  String companyName,
			String deliveryDate, Customer customer, double totalPrice, Set<Product> product) {
		this.orderDate = orderDate;
		this.quanlity = quanlity;
		this.companyName = companyName;
		this.deliveryDate = deliveryDate;
		this.customer = customer;
		this.totalPrice = totalPrice;
		this.product = product;
	}
	
	
	public Order(String orderDate, int quanlity, Customer customer, Set<Product> product) {
		super();
		this.orderDate = orderDate;
		this.quanlity = quanlity;
		this.customer = customer;
		this.product = product;
	}

	public Order() {
		
	}
	
	
}
