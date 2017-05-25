/**
 * 
 */
package com.hibernate.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author: Yijun Chen
 * @date: Mar 12, 2017
 * @time: 9:41:14 PM
 */
@Entity
@Table(name = "Category10_TBL")
public class Category {
	private int categoryId;
	private String categoryName;
	private Set<Product> product = new HashSet<Product>(
			0);

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "categoryId", unique = true, nullable = false)
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	@Column(name = "categoryName", unique = true, nullable = false)
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public Category(int categoryId, String categoryName, Set<Product> product) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.product = product;
	}

	public Category() {
		
	}
	
	
}
