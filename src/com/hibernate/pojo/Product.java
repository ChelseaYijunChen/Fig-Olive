/**
 * 
 */
package com.hibernate.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author: Yijun Chen
 * @date: Mar 4, 2017
 * @time: 3:13:54 PM
 */
@Entity
@Table(name = "Product10_TBL")
public class Product implements Serializable{
	private int productId;
	private Category category;
	private String productName;
	private String productDescription;
	private String productImage;
	private double productPrice;
	private String isAvailable;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "productId", unique = true, nullable = false)
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

//	@Column(name = "category",  nullable = false)
//	public String getCategory() {
//		return category;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryId", nullable = false)
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}	

	@Column(name = "productName",  nullable = false)
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "productDescription",  nullable = false, length=400)
	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Column(name = "productImage",  nullable = false)
	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	@Column(name = "productPrice",  nullable = false)
	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	@Column(name = "isAvailable",  nullable = false)
	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
	
//	public String getPriceCurrencyFormat()
//	{
//		NumberFormat currency = NumberFormat.getCurrencyInstance();
//		return currency.format(productPrice);
//	}   

//	public int getProductQuantity() {
//		return productQuantity;
//	}
//
//	public void setProductQuantity(int productQuantity) {
//		this.productQuantity = productQuantity;
//	}

//	public Product(int productId, Category category, String productName, String productDescription, String productImage,
//			double productPrice) {
//		this.productId = productId;
//		this.category = category;
//		this.productName = productName;
//		this.productDescription = productDescription;
//		this.productImage = productImage;
//		this.productPrice = productPrice;
////		this.productQuantity = productQuantity;
//	}
	
	public Product(int productId, Category category, String productName, String productDescription, String productImage,
			double productPrice, String isAvailable) {
		super();
		this.productId = productId;
		this.category = category;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.isAvailable = isAvailable;
	}

	public Product() {
		
	}	
	
	public String toString(){
		return this.productName + " " + this.productPrice ;
	}
}
